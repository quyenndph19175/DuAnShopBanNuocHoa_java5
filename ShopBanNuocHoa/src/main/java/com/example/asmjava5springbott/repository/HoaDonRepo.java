package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonRepo extends JpaRepository<HoaDon,Integer> {
    @Query("select  c.id from HoaDonChiTiet c  ORDER BY c.id desc limit 1")
     int layidMaHd();
}
