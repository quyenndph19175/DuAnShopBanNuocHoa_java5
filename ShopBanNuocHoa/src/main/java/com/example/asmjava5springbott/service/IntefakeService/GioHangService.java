package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.GioHang;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface GioHangService  {
    void saveGioHang(GioHang gioHang);

    Optional<GioHang> findGioHang(int id);

    int getIdGioHang();
}
