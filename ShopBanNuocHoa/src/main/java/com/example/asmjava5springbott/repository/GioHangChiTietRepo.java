package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.GioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GioHangChiTietRepo extends JpaRepository<GioHangChiTiet,Integer> {

}
