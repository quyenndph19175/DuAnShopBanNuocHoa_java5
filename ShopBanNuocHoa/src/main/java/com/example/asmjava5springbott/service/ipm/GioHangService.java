package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.GioHang;
import com.example.asmjava5springbott.repository.GioHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class GioHangService implements com.example.asmjava5springbott.service.IntefakeService.GioHangService {
    @Autowired
    GioHangRepo gioHangRepo;
    @Override
    public void saveGioHang(GioHang gioHang) {
        gioHang.setMa("GD"+getIdGioHang()+1);
        gioHangRepo.save(gioHang);
    }

    @Override
    public Optional<GioHang> findGioHang(int id) {
        return gioHangRepo.findById(id);
    }

    @Override
    public int getIdGioHang() {
        return gioHangRepo.getIdGioHang();
    }
}
