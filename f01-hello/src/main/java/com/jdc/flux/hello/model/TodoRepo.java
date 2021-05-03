package com.jdc.flux.hello.model;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface TodoRepo extends R2dbcRepository<Todo, Integer> {
}
