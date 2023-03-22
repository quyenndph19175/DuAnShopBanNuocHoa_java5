package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface ChiTietSanPhamRepo extends JpaRepository<ChiTietSanPham,Integer> {

    @Query("SELECT c from ChiTietSanPham  c  order by c.id desc limit 6")
    List<ChiTietSanPham> getSpMoiNhat();  // lấy ra sản phẩm mới thêm vào dựa vào id của sp

    @Query("SELECT c from ChiTietSanPham c order by c.id  ASC  limit 6")
    List<ChiTietSanPham> getSanPhamKhac();  // lấy ra sản phẩm mới thêm vào dựa vào id của sp

    @Query("SELECT c from ChiTietSanPham c where c.dongSanPham.ten=:tendong")
    List<ChiTietSanPham> getSpTheoCategory(@PathVariable("ten")String tendong);  // lấy ra sản phẩm mới thêm vào dựa vào id của sp
}
