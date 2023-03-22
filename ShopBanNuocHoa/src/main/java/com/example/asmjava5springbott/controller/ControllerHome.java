package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.dto.SanPhamDto;
import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.HoaDonChiTiet;
import com.example.asmjava5springbott.service.ipm.ChiTietSanPhamQuanLy;
import com.example.asmjava5springbott.service.ipm.HoaDonChiTietService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home/")
public class ControllerHome {
    @Autowired
    ChiTietSanPhamQuanLy chiTietSanPhamQuanLy;
    @Autowired
    HoaDonChiTietService hoaDonChiTietService;
    @Autowired
    HttpSession httpSession;
    @Autowired
    HttpServletRequest request;

    @Autowired
    ModelMapper modelMapper;
    List<ChiTietSanPham> listSanPham;
    List<ChiTietSanPham> listSpMoi;
    List<ChiTietSanPham> listSpKhac;
    List<Integer> listidSanPhamBanChay;
    List<ChiTietSanPham> listSanPhamBanChay = new ArrayList<>();

    @GetMapping("hienThi")
    public String hienThiHome(Model model){
        listSpKhac = chiTietSanPhamQuanLy.getSanPham();
        listSpMoi = chiTietSanPhamQuanLy.getSpMoiNhat();
        listidSanPhamBanChay = hoaDonChiTietService.getSanBanChay();

        List<SanPhamDto> dtoSpKhac = modelMapper.map(listSpKhac, new TypeToken<List<SanPhamDto>>() {}.getType());
        List<SanPhamDto> dtoSpMoi = modelMapper.map(listSpMoi, new TypeToken<List<SanPhamDto>>() {}.getType());
        List<SanPhamDto> dtoSpbanChay = modelMapper.map(listidSanPhamBanChay, new TypeToken<List<SanPhamDto>>() {}.getType());

        model.addAttribute("sanPhamNew",dtoSpMoi);
        model.addAttribute("spKhac",dtoSpKhac);

        for (Integer i:listidSanPhamBanChay) {
            ChiTietSanPham sp=  chiTietSanPhamQuanLy.findById(i).get();
            listSanPhamBanChay.add(sp);
        }
        model.addAttribute("spBanChay",listSanPhamBanChay);
        model.addAttribute("view", "home.jsp");
        return "layout";
    }


    @GetMapping("{id}")
    public String detailSanPham(@PathVariable("id") String id,Model model){
        httpSession.setAttribute("uri_sanPham",request.getRequestURI());
        System.out.println("hiển thị uri : "+ httpSession.getAttribute("uri_sanPham"));
        ChiTietSanPham sp=  chiTietSanPhamQuanLy.findById(Integer.parseInt(id)).get();
        model.addAttribute("detail",sp);
        model.addAttribute("view", "sanPham/detail.jsp");
        return "layout";

    }
}
