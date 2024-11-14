package com.example.spring_boot.service.iplm;

import com.example.spring_boot.model.Product;
import com.example.spring_boot.repository.IProductRepository;
import com.example.spring_boot.service.IProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }
}
