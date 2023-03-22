package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.DongSanPham;
import com.example.asmjava5springbott.entity.Nsx;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DongSanPhamService {
    List<DongSanPham> getDongSanPham();
}
