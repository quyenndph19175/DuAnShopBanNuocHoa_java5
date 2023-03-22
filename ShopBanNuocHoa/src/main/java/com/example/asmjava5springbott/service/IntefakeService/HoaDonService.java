package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.HoaDon;
import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface HoaDonService  {
    List<HoaDon> getAllHoaDon();
    void saveHoaDon(HoaDon hd);

    void saveHoaDonSauCapNhat(HoaDon hd);

    void deleteHoaDon(Integer id);

    Optional<HoaDon> findHdById(int id);
    int layidMaHoaDon();
}
