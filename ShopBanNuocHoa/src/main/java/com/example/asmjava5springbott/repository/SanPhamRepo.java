package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface SanPhamRepo extends JpaRepository<SanPham,Integer> {
    @Query("select c.id FROM SanPham c where c.ma=:maSp")
     int idSP(@RequestParam("maSp")String maSp);
}
