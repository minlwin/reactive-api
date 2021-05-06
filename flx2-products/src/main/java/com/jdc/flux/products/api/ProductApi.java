package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Product;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("product")
public class ProductApi {

    @GetMapping
    public Flux<Product> search() {
        return null;
    }

    @PostMapping
    public Mono<Product> create(@RequestBody Product product) {
        return null;
    }

    @PutMapping("{id}")
    public Mono<Product> update(@PathVariable int id, @RequestBody Product product) {
        return null;
    }

    @GetMapping("{id}")
    public Mono<Product> findById(@PathVariable int id) {
        return null;
    }
}
