package com.carolan.erp_lite.persistence.mongo.documents;

import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
@Document(collection = "catalogs")
public class CatalogDocument {
    @Id 
    private String id;

    @Field(name = "active")
    private boolean active;

    private CatalogType catalogType;

    private Instant createdAt;

    private Instant updatedAt;

    private String description;

    private String name;

    private List<CatalogItem> items;
}
