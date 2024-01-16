package com.debuggeandoideas.reportms.services;

public interface ReportService {

    String makeReport(String name);
    String saveReport(String nameReport);
    void deleteReport(String name);
}
