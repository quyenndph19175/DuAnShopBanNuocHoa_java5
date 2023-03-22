package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.KhachHang;
import com.example.asmjava5springbott.entity.NhanVien;
import com.example.asmjava5springbott.repository.NhanVienRepo;
import com.example.asmjava5springbott.repository.khachHangRepo;
import com.example.asmjava5springbott.service.IntefakeService.LoginInte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginInte {
    @Autowired
    NhanVienRepo nhanVienRepo;
    @Autowired
    khachHangRepo khachHangRepo;
    @Override
    public NhanVien checkLoginNhanVien(String ma, String mk) {
        if(ma.equals("")||mk.equals("")|| ma.equals("")&&mk.equals("")){
            System.out.println("Thiếu mk hoặc tk");
            return new NhanVien();
        }
            return nhanVienRepo.checkLogin(ma,mk);
    }

    @Override
    public KhachHang checkLoginKhachHang(String ma, String mk) {
        if(ma.equals("")||mk.equals("")|| ma.equals("")&&mk.equals("")){
            System.out.println("Thiếu mk hoặc tk");
            return new KhachHang();
        }
        return khachHangRepo.checkLogin(ma,mk);
    }
}
