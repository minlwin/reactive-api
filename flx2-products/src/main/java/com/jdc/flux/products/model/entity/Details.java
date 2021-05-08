package com.jdc.flux.products.model.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("invoice_product")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Details(
        @Id int id,
        @Column ("invoice_id") int invoiceId,
        @Column ("product_id") int productId,
        @Column ("quantity") int count,
        @Column ("unit_price") int price
) {
    public static Details of(int id, Details o) {
        return new Details(id, o.invoiceId(), o.productId(), o.count(), o.price());
    }

    public static Details withInvoice(int id, Details d) {
        return new Details(0, id, d.productId(), d.count(), d.price());
    }

    public static List<Details> withInvoice(int id, List<Details> list) {
        return list.stream().map(a -> Details.withInvoice(id, a)).toList();
    }
}
