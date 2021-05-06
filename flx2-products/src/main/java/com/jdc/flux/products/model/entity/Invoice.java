package com.jdc.flux.products.model.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDate;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Invoice(
        @Id int id,
        @Column("invoice_date")LocalDate date,
        @Column("member_id") int memberId,
        int total,
        @Column("quantity") int count,
        @Column("address_id") int addressId,
        String remark
        ) {
}
