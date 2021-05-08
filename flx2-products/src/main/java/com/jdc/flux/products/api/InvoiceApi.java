package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Details;
import com.jdc.flux.products.model.entity.Invoice;
import com.jdc.flux.products.model.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("invoice")
public class InvoiceApi {

    @Autowired
    private InvoiceService service;

    @GetMapping
    public Flux<Invoice> search(
            @RequestParam(required = false) String customer,
            @RequestParam(required = false) LocalDate from,
            @RequestParam(required = false) LocalDate to) {
        return service.search(customer, from, to);
    }

    @PostMapping
    public Mono<Invoice> create(@RequestBody Invoice invoice) {
        return service.save(invoice);
    }

    @PutMapping("{id}")
    public Mono<Invoice> update(@PathVariable int id, @RequestBody Invoice invoice) {
        return service.save(id, invoice);
    }

    @GetMapping("{id}")
    public Mono<Invoice> findById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("{id}/details")
    public Flux<Details> getDetails(@PathVariable int id) {
        return service.findDetails(id);
    }

    @PostMapping("{id}/details")
    public Flux<Details> createDetails(@PathVariable int id, @RequestBody List<Details> list) {
        return service.createDetails(id, list);
    }

    @PutMapping("{id}/details")
    public Flux<Details> updateDetails(@PathVariable int id, @RequestBody List<Details> list) {
        return service.updateDetails(id, list);
    }
}
