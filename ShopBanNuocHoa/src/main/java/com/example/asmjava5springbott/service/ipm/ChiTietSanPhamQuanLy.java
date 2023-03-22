package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.SanPham;
import com.example.asmjava5springbott.repository.ChiTietSanPhamRepo;
import com.example.asmjava5springbott.service.IntefakeService.ChiTietSanPhamService;
import com.example.asmjava5springbott.service.IntefakeService.SanPhamService;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Optional;

@Service
public class ChiTietSanPhamQuanLy implements ChiTietSanPhamService {

    @Autowired
    ChiTietSanPhamRepo sanPhamRepo;
    @Autowired
    ServletContext context;

    @Override
    public List<ChiTietSanPham> getChiTietSanPham() {
        return sanPhamRepo.findAll();
    }

    @Override
    public void saveChiTietSanPham(MultipartFile photo, ChiTietSanPham spChiTiet, SanPham sanPham) {
        if (photo.isEmpty()) {
            System.out.println("vui lòng chọn file");
        } else {
            try {
                String photoPath = context.getRealPath("/img/" + photo.getOriginalFilename());
                spChiTiet.setAnh(photo.getOriginalFilename());
                ;
                photo.transferTo(new File(photoPath));
                sanPhamRepo.save(spChiTiet);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveChiTietSanPhamTach(MultipartFile file, ChiTietSanPham spChiTiet) {
        if (file.isEmpty()) {
            System.out.println("vui lòng chọn file");
        } else {
            try {
                String photoPath = context.getRealPath("/img/" + file.getOriginalFilename());
                spChiTiet.setAnh(file.getOriginalFilename());
                ;
                file.transferTo(new File(photoPath));
                sanPhamRepo.save(spChiTiet);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void delete(Integer id) {
        sanPhamRepo.deleteById(id);

    }

    @Override
    public Optional<ChiTietSanPham> findById(Integer id) {
        return sanPhamRepo.findById(id);
    }

    @Override
    public List<ChiTietSanPham> getSpMoiNhat() {
        return sanPhamRepo.getSpMoiNhat();
    }

    @Override
    public List<ChiTietSanPham> getSanPham() {
        return sanPhamRepo.getSanPhamKhac();
    }

    @Override
    public Page<ChiTietSanPham> findPaginated(int pageNum, int size) {
        Pageable pageable = PageRequest.of(pageNum - 1, size);
        return sanPhamRepo.findAll(pageable);
    }

    @Override
    public List<ChiTietSanPham> listSpTheoCate(String tenDong) {
        return sanPhamRepo.getSpTheoCategory(tenDong);
    }


}
