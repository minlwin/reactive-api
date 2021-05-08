package com.jdc.flux.products.model.service;

import com.jdc.flux.products.model.entity.Category;
import com.jdc.flux.products.model.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo repo;

    public Flux<Category> findAll() {
        return repo.findAll();
    }

    @Transactional
    public Mono<Category> save(Category category) {
        return repo.save(category);
    }

    @Transactional
    public Mono<Category> save(int id, Category category) {
        return repo.findById(id).flatMap(a -> repo.save(Category.of(id, category)));
    }
}
