package com.carolan.erp_lite.domain.order.events;

import java.time.Instant;

import com.carolan.erp_lite.domain.common.DomainEvent;
import com.carolan.erp_lite.domain.order.OrderId;

/**
 * Emitted when order transitions SHIPPED -> DELIVERED.
 * Final state.
 *
 * @param orderId   the order identifier
 * @param timestamp the event timestamp
 */
public record OrderDelivered(
        OrderId orderId,
        Instant timestamp) implements DomainEvent {
}
