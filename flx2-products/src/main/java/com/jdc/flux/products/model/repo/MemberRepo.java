package com.jdc.flux.products.model.repo;

import com.jdc.flux.products.model.entity.Member;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface MemberRepo extends R2dbcRepository<Member, Integer> {
}
