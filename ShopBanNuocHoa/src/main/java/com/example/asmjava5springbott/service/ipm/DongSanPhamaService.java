package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.DongSanPham;
import com.example.asmjava5springbott.repository.DongSanPhamRepo;
import com.example.asmjava5springbott.service.IntefakeService.DongSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DongSanPhamaService implements DongSanPhamService {

    @Autowired
    DongSanPhamRepo dongSanPhamRepo;
    @Override
    public List<DongSanPham> getDongSanPham() {
        return dongSanPhamRepo.findAll();
    }
}
