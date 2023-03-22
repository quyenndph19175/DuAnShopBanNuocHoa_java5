package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import com.example.asmjava5springbott.repository.HoaDonChiTietRepo;
import com.example.asmjava5springbott.service.IntefakeService.IHoaDonChiTiet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoaDonChiTietService implements IHoaDonChiTiet {
@Autowired
HoaDonChiTietRepo hoaDonChiTietRepo;

    @Override
    public List<Integer> getSanBanChay() {
        return hoaDonChiTietRepo.getSpBanChay();
    }

    @Override
    public List<HoaDonChiTiet> getAllHoaDon() {
        return hoaDonChiTietRepo.findAll();
    }

    @Override
    public void saveHoaDonChiTiet(HoaDonChiTiet hd) {
        hoaDonChiTietRepo.save(hd);
    }

    @Override
    public void deleteHdChiTiet(Integer id) {
        hoaDonChiTietRepo.deleteById(id);

    }

    @Override
    public Optional<HoaDonChiTiet> findHdById(int id) {
        return hoaDonChiTietRepo.findById(id);
    }

    @Override
    public List<HoaDonChiTiet> getSpOrder() {
        return hoaDonChiTietRepo.getSpOrder();
    }
}
