package com.example.final_module.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tự động tăng id
    private Long id;

    private String name;
    private BigDecimal price;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_loai_sp")
    private LoaiSanPham loaiSanPham;

    public SanPham() {
    }

    public SanPham(String name, BigDecimal price, String status, LoaiSanPham loaiSanPham) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.loaiSanPham = loaiSanPham;
    }

    public SanPham(Long id, String name, BigDecimal price, String status, LoaiSanPham loaiSanPham) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.loaiSanPham = loaiSanPham;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }
}
