package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.entity.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ProductRepo extends R2dbcRepository<Product, Integer> {
}
