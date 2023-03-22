package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.KhachHang;
import com.example.asmjava5springbott.repository.khachHangRepo;
import com.example.asmjava5springbott.service.IntefakeService.khachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
public class KhachHangService implements khachHangService {

    @Autowired
    khachHangRepo khachHangRepo;
    @Override
    public void saveKhachHang(KhachHang kh) {
        khachHangRepo.save(kh);
    }

    @Override
    public Optional<KhachHang> findHdById(int id) {
        return khachHangRepo.findById(id);
    }

    @Override
    public int getIdKhachHang() {
        return khachHangRepo.getIdKhachHang();
    }
}
