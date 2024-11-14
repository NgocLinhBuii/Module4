package com.example.spring_boot.repository;

import com.example.spring_boot.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
//Page phù hợp cho các db trung bình và nhỏ
// slice phù hợp cho db lớn
@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
//    @Query("select p from Product p join fetch p.category")
//    List<Product> findAll();
    Page<Product> findAll(Pageable pageable);
}
