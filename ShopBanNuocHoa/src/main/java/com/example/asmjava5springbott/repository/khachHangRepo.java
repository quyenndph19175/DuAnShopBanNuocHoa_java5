package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.GioHang;
import com.example.asmjava5springbott.entity.KhachHang;
import com.example.asmjava5springbott.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface khachHangRepo extends JpaRepository<KhachHang, Integer> {

    @Query("SELECT c from KhachHang  c  where c.ma=:ma and c.matKhau=:mk")
    KhachHang checkLogin(@RequestParam("ma") String ma, @RequestParam("mk") String mk);

    @Query("SELECT c.id from KhachHang  c  order by c.id desc limit 1")
    int getIdKhachHang();  // lấy ra id Khach Hàng lớn nhất + sau khi lấy ra thì cộng

}
