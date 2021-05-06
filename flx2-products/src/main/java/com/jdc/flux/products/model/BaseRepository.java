package com.jdc.flux.products.model;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.NoRepositoryBean;
import reactor.core.publisher.Flux;

import java.util.Map;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends R2dbcRepository<T, ID> {
    Flux<T> search(String sql, Map<String, Object> params);
    <D>Flux<D> search(String sql, Map<String, Object> params, Class<D> dtoType);
    Flux<Long> searchCount(String sql, Map<String, Object> params);
}
