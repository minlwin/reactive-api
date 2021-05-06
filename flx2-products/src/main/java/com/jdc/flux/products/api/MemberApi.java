package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Address;
import com.jdc.flux.products.model.entity.Member;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("member")
public class MemberApi {

    @GetMapping
    public Flux<Member> search() {
        return null;
    }

    @PostMapping
    public Mono<Member> create(@RequestBody Mono<Member> member) {
        return null;
    }

    @PutMapping
    public Mono<Member> update(@PathVariable int id, Mono<Member> member) {
        return null;
    }

    @GetMapping("{id}")
    public Mono<Member> findById(@PathVariable int id) {
        return null;
    }

    @GetMapping("{id}/address")
    public Flux<Address> memberAddress(@PathVariable int id) {
        return null;
    }

    @PostMapping("{id}/address")
    public Mono<Address> createAddress(@PathVariable int id, @RequestBody Address address) {
        return null;
    }

    @PutMapping("{id}/address")
    public Mono<Address> updateAddress(@PathVariable int id, @RequestBody Address address) {
        return null;
    }

}
