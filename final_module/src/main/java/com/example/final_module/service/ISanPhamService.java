package com.example.final_module.service;

import com.example.final_module.model.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.List;

public interface ISanPhamService {
    Page<SanPham> findAll(Pageable pageable);

    void save(SanPham sanPham);

    void deleteSanPham(List<Long> ids);

    SanPham addSanPham(SanPham sanPham);

    List<SanPham> search(String name, BigDecimal price, String loaiSanPhamName, Pageable pageable);
}
