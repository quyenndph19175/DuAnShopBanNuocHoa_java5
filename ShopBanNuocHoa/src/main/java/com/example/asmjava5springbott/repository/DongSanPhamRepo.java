package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.DongSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DongSanPhamRepo extends JpaRepository<DongSanPham,Integer> {
}
