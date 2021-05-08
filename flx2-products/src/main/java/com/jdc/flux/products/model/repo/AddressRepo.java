package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.BaseRepository;
import com.jdc.flux.products.model.entity.Address;
import reactor.core.publisher.Flux;

public interface AddressRepo extends BaseRepository<Address, Integer> {
    Flux<Address> findByMemberId(int id);
}
