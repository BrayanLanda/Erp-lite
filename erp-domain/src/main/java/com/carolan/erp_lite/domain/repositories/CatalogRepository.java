package com.carolan.erp_lite.domain.repositories;

import java.util.List;
import java.util.Optional;

import javax.xml.catalog.Catalog;

import com.carolan.erp_lite.domain.catalog.CatalogItem;
import com.carolan.erp_lite.domain.catalog.CatalogType;

public interface CatalogRepository {
    Optional<Catalog> findByType(CatalogType type);

    List<CatalogItem> findItemsByType(CatalogType type);

    Optional<CatalogItem> findItemByTypeAndCode(CatalogType type, String code);
}
