package com.jdc.flux.products.model.service;

import com.jdc.flux.products.model.entity.Address;
import com.jdc.flux.products.model.entity.Member;
import com.jdc.flux.products.model.repo.AddressRepo;
import com.jdc.flux.products.model.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MemberService {
    @Autowired
    private MemberRepo members;
    @Autowired
    private AddressRepo addresses;

    public Flux<Member> search(Member.Role role, String name, String email) {
        return null;
    }

    public Mono<Member> save(Member member) {
        return members.save(member);
    }

    public Mono<Member> save(int id, Member member) {
        return null;
    }

    public Mono<Member> findById(int id) {
        return members.findById(id);
    }

    public Flux<Address> findAddress(int id) {
        return addresses.findByMemberId(id);
    }

    public Mono<Address> createAddress(int id, Address address) {
        return members.findById(id)
                .flatMap(member -> addresses.save(Address.withMember(id, address)));
    }

    public Mono<Address> updateAddress(int id, Address address) {
        return addresses.findById(id)
                .flatMap(a -> addresses.save(Address.of(a.id(), address)));
    }
}
