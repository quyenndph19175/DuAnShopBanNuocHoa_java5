package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.dto.TinhTrang;
import com.example.asmjava5springbott.entity.HoaDon;
import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import com.example.asmjava5springbott.service.ipm.HoaDonChiTietService;
import com.example.asmjava5springbott.service.ipm.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/quanLyDonHang/")
public class ControllerQuanLyDonHang {
    int idHdcapNhat;
    int tinhTrangCapNhat;
    @Autowired
    HoaDonChiTietService hoaDonChiTietService;

    @Autowired
    HoaDonService hoaDonService;

    List<HoaDonChiTiet> getSpOrder;
    List<TinhTrang> listTinhTran = new ArrayList<>();

    @GetMapping("donHang")
    public String hienThiDonHan(Model model) {
        getSpOrder = hoaDonChiTietService.getSpOrder();
        System.out.println("độ dài lis : " + getSpOrder.size());
        model.addAttribute("spOrder", getSpOrder);
        model.addAttribute("view", "sanPham/qlDonHang.jsp");
        return "layouAdm";
    }

    @GetMapping("updateTinhTrang/{id}/{tinhTrang}")
    public String capNhatTrangThai(@PathVariable("id") String idHD, @PathVariable("tinhTrang") String status, Model model) {
        if (listTinhTran.size() == 0) {
            listTinhTran.add(new TinhTrang(1, "Chờ xác Nhận"));
            listTinhTran.add(new TinhTrang(2, "Dang Ship"));
            listTinhTran.add(new TinhTrang(3, "Đã Giao"));
        }
        model.addAttribute("status", listTinhTran);
        idHdcapNhat = Integer.parseInt(idHD);
        tinhTrangCapNhat = Integer.parseInt(status);
        model.addAttribute("tt", tinhTrangCapNhat);
        //
        HoaDon hd = hoaDonService.findHdById(idHdcapNhat).get();
        model.addAttribute("dateTime", hd);

        model.addAttribute("view", "sanPham/capNhatDonHang.jsp");
        return "layouAdm";
    }


    @PostMapping("capNhatDonHangs")
    public String capNhatDonHangs(@RequestParam("ngayShip1") String ngayShip, @ModelAttribute("hd1") HoaDon hoaDon, Model model) {
        try {
        HoaDon hd = hoaDonService.findHdById(idHdcapNhat).get();
        System.out.println("ngày " + ngayShip);
        LocalDateTime localDateTime = LocalDateTime.parse(ngayShip);
        Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
        Timestamp timestamp = Timestamp.from(instant);
        System.out.println("ra rồi nè" + timestamp);
        System.out.println("hihi tinh trang  :  " + hoaDon.getTinhTrang());
        hd.setTinhTrang(hoaDon.getTinhTrang());
        hd.setNgayShip(timestamp);
        System.out.println("sau khi set" + hd.getTinhTrang());
        hoaDonService.saveHoaDonSauCapNhat(hd);
        }catch (Exception e){
        }
        return "redirect:/quanLyDonHang/donHang";
    }
}

