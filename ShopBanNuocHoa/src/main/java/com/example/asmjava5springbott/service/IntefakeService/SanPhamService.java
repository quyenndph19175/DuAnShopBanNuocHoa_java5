package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface SanPhamService  {
     List<SanPham> getAllSanPham();

     void saveSanPham(SanPham sp);

     void delete(Integer id);

     Optional<SanPham> findById(Integer id);

     Page<SanPham> findPaginated(int pageNum,int size);


     Page<SanPham> timKiem(int a, int b, String nameCate, String namePro);

     int idSanPham(String maSP);


}
