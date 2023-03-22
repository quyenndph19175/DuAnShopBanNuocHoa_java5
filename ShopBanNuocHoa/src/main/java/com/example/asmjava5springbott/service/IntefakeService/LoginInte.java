package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.KhachHang;
import com.example.asmjava5springbott.entity.NhanVien;

public interface LoginInte {

    NhanVien checkLoginNhanVien(String ma,String mk);
    KhachHang checkLoginKhachHang(String ma, String mk);

}
