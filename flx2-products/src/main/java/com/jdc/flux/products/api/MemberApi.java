package com.jdc.flux.products.api;

import com.jdc.flux.products.model.entity.Address;
import com.jdc.flux.products.model.entity.Member;
import com.jdc.flux.products.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("member")
public class MemberApi {

    @Autowired
    private MemberService service;

    @GetMapping
    public Flux<Member> search(
            @RequestParam(required = false) Member.Role role,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        return service.search(role, name, email);
    }

    @PostMapping
    public Mono<Member> create(@RequestBody Member member) {
        return service.save(member);
    }

    @PutMapping
    public Mono<Member> update(@PathVariable int id, Member member) {
        return service.save(id, member);
    }

    @GetMapping("{id}")
    public Mono<Member> findById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("{id}/address")
    public Flux<Address> memberAddress(@PathVariable int id) {
        return service.findAddress(id);
    }

    @PostMapping("{id}/address")
    public Mono<Address> createAddress(@PathVariable int id, @RequestBody Address address) {
        return service.createAddress(id, address);
    }

    @PutMapping("address/{id}")
    public Mono<Address> updateAddress(@PathVariable int id, @RequestBody Address address) {
        return service.updateAddress(id, address);
    }

}
