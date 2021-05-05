package com.jdc.flux.hello.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Todo(
        @Id Integer id,
        String assign,
        String description,
        Boolean complete) { }
