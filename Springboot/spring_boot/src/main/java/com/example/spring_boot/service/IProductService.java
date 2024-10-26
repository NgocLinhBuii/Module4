package com.example.spring_boot.service;

import com.example.spring_boot.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
}
