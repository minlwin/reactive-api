package com.jdc.flux.products.model.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Address(
        @Id int id,
        @Column("member_id") int memberId,
        @Column("shop_to") String sendTo,
        String street,
        String address
) {

    public static Address of(int id, Address address) {
        return new Address(id, address.memberId, address.sendTo(), address.street(), address.address());
    }

    public static Address withMember(int id, Address a) {
        return new Address(a.id(), id, a.sendTo(), a.street(), a.address());
    }
}
