package com.carolan.erp_lite.persistence.mongo.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.carolan.erp_lite.persistence.mongo.documents.AuditLogDocument;

public interface AuditLogRepository extends MongoRepository<AuditLogDocument, ObjectId> {

}
