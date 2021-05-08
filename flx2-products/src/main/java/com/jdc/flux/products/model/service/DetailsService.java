package com.jdc.flux.products.model.service;

import com.jdc.flux.products.model.entity.Details;
import com.jdc.flux.products.model.repo.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Service
public class DetailsService {

    @Autowired
    private DetailsRepo repo;

    public Mono<Details> update(int id, Details details) {
        return repo.findById(id)
                .flatMap(data -> repo.save(Details.of(id, details)));
    }

    public Flux<Details> search(int category, String product, LocalDate from, LocalDate to) {
        return null;
    }
}
