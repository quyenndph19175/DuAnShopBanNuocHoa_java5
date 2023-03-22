package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;


public interface ChiTietSanPhamService {
    List<ChiTietSanPham> getChiTietSanPham();

    void saveChiTietSanPham(MultipartFile file, ChiTietSanPham spChiTiet, SanPham sanPham);

    void saveChiTietSanPhamTach(MultipartFile file, ChiTietSanPham spChiTiet);

    void delete(Integer id);

    Optional<ChiTietSanPham> findById(Integer id);

    List<ChiTietSanPham> getSpMoiNhat();

    List<ChiTietSanPham> getSanPham();

    Page<ChiTietSanPham> findPaginated(int pageNum, int size);

    List<ChiTietSanPham> listSpTheoCate(String tenDong);


}
