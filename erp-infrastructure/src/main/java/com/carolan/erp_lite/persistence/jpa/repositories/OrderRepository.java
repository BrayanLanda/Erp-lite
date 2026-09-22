package com.carolan.erp_lite.persistence.jpa.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolan.erp_lite.persistence.jpa.entities.OderEntity;

public interface OrderRepository extends JpaRepository<OderEntity, UUID>{

}
