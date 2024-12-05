package com.example.final_module.repository;

import com.example.final_module.model.LoaiSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoaiSanPhamRepository extends JpaRepository<LoaiSanPham, Long> {
}
