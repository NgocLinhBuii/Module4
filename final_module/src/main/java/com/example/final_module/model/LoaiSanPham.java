package com.example.final_module.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoaiSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;
    private String name;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String name) {
        this.name = name;
    }

    public LoaiSanPham(Long cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
