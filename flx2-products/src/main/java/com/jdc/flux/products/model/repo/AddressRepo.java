package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.entity.Address;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface AddressRepo extends R2dbcRepository<Address, Integer> {
}
