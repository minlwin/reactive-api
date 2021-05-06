package com.jdc.flux.products.model.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Product(
        @Id
        int id,
        String name,
        @Column("category_id")
        int categoryId,
        int price,
        String description,
        Boolean deleted
) {
}
