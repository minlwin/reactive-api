package com.jdc.flux.hello.api;

import com.jdc.flux.hello.model.Todo;
import com.jdc.flux.hello.model.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("todo")
public class TodoApi {
    @Autowired
    private TodoRepo repo;

    @GetMapping
    public Flux<Todo> index() {
        return repo.findAll();
    }

    @PostMapping
    public Mono<Todo> create(@RequestBody Todo todo) {
        return repo.save(todo);
    }

    @PutMapping
    public Mono<Todo> update(@RequestBody Todo todo) {
        return repo.save(todo);
    }
}
