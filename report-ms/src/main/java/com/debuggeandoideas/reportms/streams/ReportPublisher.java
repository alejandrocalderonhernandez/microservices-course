package com.debuggeandoideas.reportms.streams;

import com.debuggeandoideas.reportms.models.Company;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReportPublisher {

    private final StreamBridge streamBridge;

    /*
    * topic name -> consumerReport
     */
    public void publishReport(String report) {
        this.streamBridge.send("consumerReport", report);
        this.streamBridge.send("consumerReport-in-0", report);
        this.streamBridge.send("consumerReport-out-0", report);
    }

    /*
     * topic name -> consumerCbReport
     */
    public Company publishCbReport(String company) {
        this.streamBridge.send("consumerCbReport", company);
        this.streamBridge.send("consumerCbReport-in-0", company);
        this.streamBridge.send("consumerCbReport-out-0", company);

        return Company.builder().build();
    }
}
