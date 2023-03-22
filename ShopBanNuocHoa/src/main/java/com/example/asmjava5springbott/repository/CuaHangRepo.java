package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuaHangRepo extends JpaRepository<CuaHang,Integer> {
}
