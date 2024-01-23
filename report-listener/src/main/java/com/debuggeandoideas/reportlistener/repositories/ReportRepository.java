package com.debuggeandoideas.reportlistener.repositories;

import com.debuggeandoideas.reportlistener.documents.ReportDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<ReportDocument, String> {
}
