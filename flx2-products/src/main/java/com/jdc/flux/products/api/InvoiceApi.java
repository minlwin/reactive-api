package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Details;
import com.jdc.flux.products.model.entity.Invoice;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("invoice")
public class InvoiceApi {

    @GetMapping
    public Flux<Invoice> search(
            @RequestParam String customer,
            @RequestParam LocalDate from,
            @RequestParam LocalDate to) {
        return null;
    }

    @PostMapping
    public Mono<Invoice> create(@RequestBody Invoice invoice) {
        return null;
    }

    @PutMapping("{id}")
    public Mono<Invoice> update(@PathVariable int id, @RequestBody Invoice invoice) {
        return null;
    }

    @GetMapping("{id}")
    public Mono<Invoice> findById(@PathVariable int id) {
        return null;
    }

    @GetMapping("{id}/details")
    public Flux<Details> getDetails(@PathVariable int id) {
        return null;
    }

    @PostMapping("{id}/details")
    public Flux<Details> createDetails(@PathVariable int id, @RequestBody List<Details> detailsList) {
        return null;
    }
}
