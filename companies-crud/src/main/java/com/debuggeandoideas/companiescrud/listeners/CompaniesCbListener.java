package com.debuggeandoideas.companiescrud.listeners;

import com.debuggeandoideas.companiescrud.entities.Company;
import com.debuggeandoideas.companiescrud.services.CompanyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class CompaniesCbListener {

    private final CompanyService companyService;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "consumerCbReport", groupId = "circuitbreaker")
    public void insertMsgEvent(String companyEvent) throws JsonProcessingException {
        log.info("Received event circuitbreaker {}", companyEvent);

        var company = this.objectMapper.readValue(companyEvent, Company.class);

        this.companyService.create(company);
    }
}
