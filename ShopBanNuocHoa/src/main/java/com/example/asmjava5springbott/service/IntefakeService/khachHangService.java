package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import com.example.asmjava5springbott.entity.KhachHang;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface khachHangService {
    void saveKhachHang(KhachHang kh);
  Optional<KhachHang> findHdById(int id);

  int getIdKhachHang();
}
