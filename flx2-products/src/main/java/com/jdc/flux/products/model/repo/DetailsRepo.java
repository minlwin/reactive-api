package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.entity.Details;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface DetailsRepo extends R2dbcRepository<Details, Integer> {
}
