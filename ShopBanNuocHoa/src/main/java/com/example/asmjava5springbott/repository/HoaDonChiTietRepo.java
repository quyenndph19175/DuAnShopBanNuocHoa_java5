package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface HoaDonChiTietRepo extends JpaRepository<HoaDonChiTiet,Integer> {

    @Query("select  c.chiTietSanPham.id from HoaDonChiTiet c group by c.chiTietSanPham.id ORDER BY " +
            "SUM(c.soLuong) limit 6")
    List<Integer> getSpBanChay();
    @Query("select  c from HoaDonChiTiet c  where c.hoaDon.tinhTrang=1 or c.hoaDon.tinhTrang=2 ")
    List<HoaDonChiTiet> getSpOrder();

}
