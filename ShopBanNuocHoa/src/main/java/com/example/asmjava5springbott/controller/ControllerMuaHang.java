package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.HoaDon;
import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import com.example.asmjava5springbott.entity.KhachHang;
import com.example.asmjava5springbott.service.ipm.ChiTietSanPhamQuanLy;
import com.example.asmjava5springbott.service.ipm.HoaDonChiTietService;
import com.example.asmjava5springbott.service.ipm.HoaDonService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ControllerMuaHang {
    int soLuongMuaNgay = 1;
    int tongTien;
    String maHoaDon = "";
    @Autowired
    ChiTietSanPhamQuanLy chiTietSanPhamQuanLy;
    @Autowired
    HoaDonChiTietService hoaDonChiTietService;
    @Autowired
    HoaDonService hoaDonService;
    @Autowired
    HttpSession httpSession;
    List<ChiTietSanPham> listSpMua;
    ChiTietSanPham sp;

    @GetMapping("/user/produc/buy/{id}")
    public String buyProduc(@PathVariable("id") String id, @RequestParam("soLuongMua") String soLuong, Model model) {
        sp = chiTietSanPhamQuanLy.findById(Integer.parseInt(id)).get();
        soLuongMuaNgay = Integer.parseInt(soLuong);
        tongTien = soLuongMuaNgay * sp.getGiaBan();
        //
        model.addAttribute("spMua", sp);
        model.addAttribute("tonTien", tongTien);
        model.addAttribute("soLuong", soLuongMuaNgay);
        //
        model.addAttribute("view", "sanPham/muaNhanh.jsp");
        return "layout";
    }

    @PostMapping("/user/produc/buyproduc")
    public String saveHDandHdChiTiet(@ModelAttribute("hd") HoaDon hoaDon,@ModelAttribute("HDct")HoaDonChiTiet hoaDonChiTiet, Model model) {
        System.out.println( "Chưa thêm  "+hoaDonService.layidMaHoaDon());
        int idKh = Integer.parseInt(httpSession.getAttribute("idKh").toString());
        hoaDon.setKhachHang( new KhachHang(idKh));
        hoaDonService.saveHoaDon(hoaDon);
        int idHoaDon = hoaDonService.layidMaHoaDon()+1;
        hoaDonChiTiet.setSoLuong(soLuongMuaNgay);
        hoaDonChiTiet.setDonGia(tongTien);
        hoaDonChiTiet.setHoaDon(new HoaDon(idHoaDon));
        hoaDonChiTiet.setChiTietSanPham(new ChiTietSanPham(sp.getId()));
        System.out.println("idHoaDon no add"+ idHoaDon);
        hoaDonChiTietService.saveHoaDonChiTiet(hoaDonChiTiet );
        //
        System.out.println("idHoaDon "+ idHoaDon);
        // id, sl, dơn giá hd , ct
        model.addAttribute("view", "sanPham/donHang.jsp");
        return "layout";
    }
}
