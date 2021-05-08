package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Category;
import com.jdc.flux.products.model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("category")
public class CategoryApi {

    @Autowired
    private CategoryService service;

    @GetMapping
    public Flux<Category> search() {
        return service.findAll();
    }

    @PostMapping
    public Mono<Category> create(@RequestBody Category category) {
        return service.save(category);
    }

    @PutMapping("{id}")
    public Mono<Category> update(@PathVariable int id, @RequestBody Category category) {
        return service.save(id, category);
    }
}
