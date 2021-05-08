package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Product;
import com.jdc.flux.products.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("product")
public class ProductApi {

    @Autowired
    private ProductService service;

    @GetMapping
    public Flux<Product> search(
            @RequestParam(required = false) int category,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) int priceFrom,
            @RequestParam(required = false) int priceTo
    ) {
        return service.search(category, name, priceFrom, priceTo);
    }

    @PostMapping
    public Mono<Product> create(@RequestBody Product product) {
        return service.save(product);
    }

    @PutMapping("{id}")
    public Mono<Product> update(@PathVariable int id, @RequestBody Product product) {
        return service.save(id, product);
    }

    @GetMapping("{id}")
    public Mono<Product> findById(@PathVariable int id) {
        return service.findById(id);
    }
}
