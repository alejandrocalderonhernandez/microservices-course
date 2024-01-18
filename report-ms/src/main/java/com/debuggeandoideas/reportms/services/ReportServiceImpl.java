package com.debuggeandoideas.reportms.services;

import com.debuggeandoideas.reportms.helpers.ReportHelper;
import com.debuggeandoideas.reportms.models.Company;
import com.debuggeandoideas.reportms.models.WebSite;
import com.debuggeandoideas.reportms.repositories.CompaniesFallbackRepository;
import com.debuggeandoideas.reportms.repositories.CompaniesRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
@Slf4j
public class ReportServiceImpl implements ReportService {

    private final CompaniesRepository companiesRepository;
    private final ReportHelper reportHelper;
    private final CompaniesFallbackRepository companiesFallbackRepository;
    private final Resilience4JCircuitBreakerFactory circuitBreakerFactory;

    @Override
    public String makeReport(String name) {
        var circuitBreaker = this.circuitBreakerFactory.create("companies-circuitbreaker");
        return circuitBreaker.run(
                () -> this.makeReportMain(name),
                throwable -> this.makeReportFallback(name, throwable)
        );
    }

    @Override
    public String saveReport(String report) {
       var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       var placeholders = this.reportHelper.getPlaceholdersFromTemplate(report);
        var webSites = Stream.of(placeholders.get(3))
                .map(website -> WebSite.builder().name(website).build())
                .toList();

        var company = Company.builder()
                .name(placeholders.get(0))
                .foundationDate(LocalDate.parse(placeholders.get(1), format))
                .founder(placeholders.get(2))
                .webSites(webSites)
                .build();

        this.companiesRepository.postByName(company);
        return "Saved";
    }

    @Override
    public void deleteReport(String name) {
        this.companiesRepository.deleteByName(name);
    }

    private String makeReportMain(String name) {
        return reportHelper.readTemplate(this.companiesRepository.getByName(name).orElseThrow());
    }

    private String makeReportFallback(String name, Throwable error) {
        log.warn(error.getMessage());
        return reportHelper.readTemplate(this.companiesFallbackRepository.getByName(name));
    }
}
