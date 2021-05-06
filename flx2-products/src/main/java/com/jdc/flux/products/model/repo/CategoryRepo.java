package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.entity.Category;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CategoryRepo extends R2dbcRepository<Category, Integer> {
}
