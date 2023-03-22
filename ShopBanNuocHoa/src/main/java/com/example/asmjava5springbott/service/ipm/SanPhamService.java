package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.SanPham;
import com.example.asmjava5springbott.repository.SanPhamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SanPhamService implements com.example.asmjava5springbott.service.IntefakeService.SanPhamService {

    @Autowired
    SanPhamRepo sanPhamRepo;

    @Override
    public List<SanPham> getAllSanPham() {
        return sanPhamRepo.findAll();
    }

    @Override
    public void saveSanPham(SanPham sp) {
        sanPhamRepo.save(sp);

    }

    @Override
    public void delete(Integer id) {
        sanPhamRepo.deleteById(id);

    }

    @Override
    public Optional<SanPham> findById(Integer id) {
        return sanPhamRepo.findById(id);
    }

    @Override
    public Page<SanPham> findPaginated(int pageNum, int size) {
        return null;
    }

    @Override
    public Page<SanPham> timKiem(int a, int b, String nameCate, String namePro) {
        return null;
    }

    @Override
    public int idSanPham(String maSP) {
        return sanPhamRepo.idSP(maSP);
    }


}
