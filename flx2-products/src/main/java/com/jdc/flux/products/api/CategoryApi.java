package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Category;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("category")
public class CategoryApi {

    @GetMapping
    public Flux<Category> search() {
        return null;
    }

    @PostMapping
    public Mono<Category> create(@RequestBody Category category) {
        return null;
    }

    @PutMapping("{id}")
    public Mono<Category> update(@PathVariable int id, @RequestBody Category category) {
        return null;
    }
}
