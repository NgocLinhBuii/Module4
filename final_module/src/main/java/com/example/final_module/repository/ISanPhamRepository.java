package com.example.final_module.repository;

import com.example.final_module.model.SanPham;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ISanPhamRepository extends JpaRepository<SanPham, Long> {
    List<SanPham> findByName(String name, BigDecimal price, String loaiSanPhamName, Pageable pageable);
}
