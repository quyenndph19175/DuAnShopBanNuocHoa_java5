package com.example.asmjava5springbott.service.IntefakeService;

import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface IHoaDonChiTiet {
 List<Integer> getSanBanChay();
 List<HoaDonChiTiet> getAllHoaDon();
 void saveHoaDonChiTiet(HoaDonChiTiet hd);

 void deleteHdChiTiet(Integer id);

 Optional<HoaDonChiTiet> findHdById(int id);
 List<HoaDonChiTiet> getSpOrder();

}
