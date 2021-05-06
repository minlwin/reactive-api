package com.jdc.flux.products.model.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("invoice_product")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Details(
        @Id int id,
        @Column ("invoice_id") int invoiceId,
        @Column ("product_id") int productId,
        @Column ("quantity") int count,
        @Column ("unit_price") int price
) {
}
