package com.jdc.flux.products.model.service;

import com.jdc.flux.products.model.entity.Product;
import com.jdc.flux.products.model.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public Flux<Product> search(int category, String name, int priceFrom, int priceTo) {
        return null;
    }

    @Transactional
    public Mono<Product> save(Product product) {
        return repo.save(product);
    }

    @Transactional
    public Mono<Product> save(int id, Product product) {
        return repo.findById(id)
                .flatMap(a -> repo.save(Product.of(a.id(), product)));
    }

    public Mono<Product> findById(int id) {
        return repo.findById(id);
    }
}
