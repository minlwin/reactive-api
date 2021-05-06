package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.entity.Invoice;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface InvoiceRepo extends R2dbcRepository<Invoice, Integer> {
}
