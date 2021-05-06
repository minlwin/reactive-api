package com.jdc.flux.products;

import com.jdc.flux.products.model.BaseRepositoryImpl;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class ApplicationRepoConfig {
}
