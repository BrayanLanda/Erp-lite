package com.carolan.erp_lite.domain.product.events;

import java.time.Instant;

import com.carolan.erp_lite.domain.common.DomainEvent;
import com.carolan.erp_lite.domain.product.ProductId;
import com.carolan.erp_lite.domain.product.ProductName;
import com.carolan.erp_lite.domain.product.SKU;
import com.carolan.erp_lite.domain.shared.Money;

/**
 * Emitted when a new product is created.
 * TRIGGERS sync to MongoDB (CQRS).
 *
 * @param productId the product identifier
 * @param sku       the product SKU
 * @param name      the product name
 * @param price     the product price
 * @param timestamp the event timestamp
 */
public record ProductCreated(
        ProductId productId,
        SKU sku,
        ProductName name,
        Money price,
        Instant timestamp) implements DomainEvent {
}