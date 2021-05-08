package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.BaseRepository;
import com.jdc.flux.products.model.entity.Details;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DetailsRepo extends BaseRepository<Details, Integer> {
    Flux<Details> findByBalanceId(int id);

    Mono<Void> deleteByInvoiceId(int id);
}
