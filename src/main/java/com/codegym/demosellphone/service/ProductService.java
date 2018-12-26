package com.codegym.demosellphone.service;

import com.codegym.demosellphone.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Optional<Product> findById(Integer id);

    void save(Product product);

    void remove(Integer id);


}