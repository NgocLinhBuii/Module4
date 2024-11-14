package com.example.thymeleaf.service;


import com.example.thymeleaf.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Product A", 10.0, "Description A"));
        products.add(new Product(2L, "Product B", 15.0, "Description B"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        product.setId((long) (products.size() + 1));
        products.add(product);
    }

    @Override
    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void update(Long id, Product product) {
        delete(id);
        product.setId(id);
        products.add(product);
    }

    @Override
    public void delete(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}