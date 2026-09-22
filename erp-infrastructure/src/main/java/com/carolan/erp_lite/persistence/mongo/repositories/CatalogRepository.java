package com.carolan.erp_lite.persistence.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carolan.erp_lite.persistence.mongo.documents.CatalogDocument;

public interface CatalogRepository extends MongoRepository<CatalogDocument, String> {

}
