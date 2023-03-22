package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GioHangRepo extends JpaRepository<GioHang,Integer> {

    // lấy ra id giỏ hàng lớn nhất + sau khi lấy ra thì cộng
    @Query("SELECT c.id from GioHang  c  order by c.id desc limit 1")
    int getIdGioHang();
}
