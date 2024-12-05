package com.example.final_module.service;

import com.example.final_module.model.SanPham;
import com.example.final_module.repository.ILoaiSanPhamRepository;
import com.example.final_module.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SanPhamService implements ISanPhamService {

        @Autowired
        private ISanPhamRepository iSanPhamRepository;

        @Autowired
        private ILoaiSanPhamRepository iLoaiSanPhamRepository;

        @Override
        public Page<SanPham> findAll(Pageable pageable) {
            return iSanPhamRepository.findAll(pageable);
        }

    @Override
    public void save(SanPham sanPham) {
        iSanPhamRepository.save(sanPham);
    }

    @Override
        public void deleteSanPham(List<Long> ids) {
            iSanPhamRepository.deleteAllById(ids);
        }

        @Override
        public SanPham addSanPham(SanPham sanPham) {
            return iSanPhamRepository.save(sanPham);
        }

        @Override
        public List<SanPham> search(String name, BigDecimal price, String loaiSanPhamName, Pageable pageable) {
            return iSanPhamRepository.findByName(name, price, loaiSanPhamName, pageable);
        }
}

