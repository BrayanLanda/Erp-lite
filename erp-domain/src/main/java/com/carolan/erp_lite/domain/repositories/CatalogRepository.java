package com.carolan.erp_lite.domain.repositories;

import java.util.Optional;

import javax.xml.catalog.Catalog;

import com.carolan.erp_lite.domain.catalog.CatalogType;

public interface CatalogRepository{
    Optional<Catalog> findByType(CatalogType type);
}
