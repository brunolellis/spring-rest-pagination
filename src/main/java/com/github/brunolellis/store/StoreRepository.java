package com.github.brunolellis.store;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface StoreRepository extends PagingAndSortingRepository<Store, String> {

    @RestResource
    Page<Store> findByName(String name, Pageable pageable);

}
