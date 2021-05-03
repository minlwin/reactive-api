package com.jdc.flux.hello.model;

import org.springframework.data.annotation.Id;

public record Todo(
        @Id Integer id,
        String assign,
        String description,
        boolean completed) {
}
