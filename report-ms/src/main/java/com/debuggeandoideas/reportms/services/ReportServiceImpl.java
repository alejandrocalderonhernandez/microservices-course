package com.debuggeandoideas.reportms.services;

import com.debuggeandoideas.reportms.helpers.ReportHelper;
import com.debuggeandoideas.reportms.models.Company;
import com.debuggeandoideas.reportms.models.WebSite;
import com.debuggeandoideas.reportms.repositories.CompaniesRepository;
import com.netflix.discovery.EurekaClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
@Slf4j
public class ReportServiceImpl implements ReportService {

    private final CompaniesRepository companiesRepository;
    private final ReportHelper reportHelper;

    @Override
    public String makeReport(String name) {
        return reportHelper.readTemplate(this.companiesRepository.getByName(name).orElseThrow());
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
}
