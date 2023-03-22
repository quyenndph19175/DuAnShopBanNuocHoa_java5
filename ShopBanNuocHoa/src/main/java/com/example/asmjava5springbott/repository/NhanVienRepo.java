package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien, Integer> {
    @Query("SELECT c from NhanVien  c  where c.ma=:ma and c.matKhau=:mk")
    NhanVien checkLogin(@RequestParam("ma") String ma, @RequestParam("mk") String mk);
}
