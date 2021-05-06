package com.jdc.flux.products.model;

import org.springframework.data.r2dbc.convert.R2dbcConverter;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import org.springframework.data.r2dbc.repository.support.SimpleR2dbcRepository;
import org.springframework.data.relational.repository.query.RelationalEntityInformation;
import reactor.core.publisher.Flux;

import java.util.Map;

public class BaseRepositoryImpl<T, ID> extends SimpleR2dbcRepository<T, ID> implements BaseRepository<T,ID>{

    private R2dbcEntityOperations entityOperations;

    public BaseRepositoryImpl(RelationalEntityInformation<T, ID> entity, R2dbcEntityOperations entityOperations, R2dbcConverter converter) {
        super(entity, entityOperations, converter);
        this.entityOperations = entityOperations;
    }

    @Override
    public Flux<T> search(String sql, Map<String, Object> params) {
        return null;
    }

    @Override
    public <D> Flux<D> search(String sql, Map<String, Object> params, Class<D> dtoType) {
        return null;
    }

    @Override
    public Flux<Long> searchCount(String sql, Map<String, Object> params) {

        return null;
    }
}
