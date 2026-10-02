package com.carolan.erp_lite.domain.product.events;

import java.time.Instant;

import com.carolan.erp_lite.domain.common.DomainEvent;
import com.carolan.erp_lite.domain.product.ProductId;

/**
 * Emitted when product is deactivated.
 * TRIGGERS sync to MongoDB.
 *
 * @param productId the product identifier
 * @param timestamp the event timestamp
 */
public record ProductDeactivated(
        ProductId productId,
        Instant timestamp) implements DomainEvent {
}
