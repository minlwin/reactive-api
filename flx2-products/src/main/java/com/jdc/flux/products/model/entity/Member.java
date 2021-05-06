package com.jdc.flux.products.model.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Member(
        @Id
        int id,
        Role role,
        String name,
        String email,
        String password
) {

    public enum Role {
        Admin, Owner, Customer
    }
}
