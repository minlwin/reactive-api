package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Details;
import com.jdc.flux.products.model.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@RestController
@RequestMapping("details")
public class DetailsApi {

    @Autowired
    private DetailsService service;

    @GetMapping
    public Flux<Details> search(
            @RequestParam int category,
            @RequestParam String product,
            @RequestParam LocalDate from,
            @RequestParam LocalDate to) {
        return service.search(category, product, from, to);
    }

    @PutMapping("{id}")
    public Mono<Details> update(@PathVariable int id, @RequestBody Details details) {
        return service.update(id, details);
    }
}
