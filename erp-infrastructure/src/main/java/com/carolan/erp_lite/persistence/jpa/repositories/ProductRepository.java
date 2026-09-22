package com.carolan.erp_lite.persistence.jpa.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolan.erp_lite.persistence.jpa.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID>{

}
