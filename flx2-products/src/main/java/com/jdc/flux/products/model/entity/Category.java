package com.jdc.flux.products.model.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Category(
        @Id int id,
        String name,
        String logo) {

    public static Category of(int id, Category o) {
        return new Category(id, o.name(), o.logo());
    }
}
