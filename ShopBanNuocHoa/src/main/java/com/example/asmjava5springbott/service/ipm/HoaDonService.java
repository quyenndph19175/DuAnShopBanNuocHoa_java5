package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.HoaDon;
import com.example.asmjava5springbott.repository.HoaDonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
@Service
public class HoaDonService implements com.example.asmjava5springbott.service.IntefakeService.HoaDonService {
    java.util.Date date =new java.util.Date();
    Timestamp ts = new Timestamp(date.getTime());
    @Autowired
    HoaDonRepo hoaDonRepo;
    @Override
    public List<HoaDon> getAllHoaDon() {
        return hoaDonRepo.findAll();
    }

    @Override
    public void saveHoaDon(HoaDon hd) {
         int dam =layidMaHoaDon()+1;
         hd.setMa("HD"+dam);
         hd.setNgayTao(ts);
         hd.setTinhTrang(1);
        hoaDonRepo.save(hd);
    }

    @Override
    public void saveHoaDonSauCapNhat(HoaDon hd) {
        hoaDonRepo.save(hd);
    }

    @Override
    public void deleteHoaDon(Integer id) {
        hoaDonRepo.deleteById(id);
    }

    @Override
    public Optional<HoaDon> findHdById(int id) {
        return hoaDonRepo.findById(id);
    }

    @Override
    public int layidMaHoaDon() {
        return  hoaDonRepo.layidMaHd();
    }
}
