package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.dto.SanPhamDto;
import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.service.ipm.ChiTietSanPhamQuanLy;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sanPham/")
public class ControllerSanPham {

    @Autowired
    ChiTietSanPhamQuanLy chiTietSanPhamQuanLy;
    @Autowired
    HttpSession httpSession;
    @Autowired
    HttpServletRequest request;
    @Autowired
    ModelMapper modelMapper;
    List<ChiTietSanPham> listall;
    List<ChiTietSanPham> listSpTheoCate;

    @GetMapping("hienThi/{pageNo}")
    public String hienThiSanPhamCategory(@PathVariable(value = "pageNo") int pageNo, Model model) {
        int pageSize = 5;
        Page<ChiTietSanPham> page = chiTietSanPhamQuanLy.findPaginated(pageNo, pageSize);
        listall = page.getContent();

        List<SanPhamDto> dtoSpAll = modelMapper.map(listall, new TypeToken<List<SanPhamDto>>() {}.getType());
        model.addAttribute("currenPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listSanPham", dtoSpAll);
        model.addAttribute("view", "sanPham/sanPham.jsp");
        return "layout";
    }

    @GetMapping("/hienThi/cate/{tenDong}")
    public String loadSanPhamTheoCate(@PathVariable("tenDong") String tenDong, Model model) {

        listSpTheoCate = chiTietSanPhamQuanLy.listSpTheoCate(tenDong);
        List<SanPhamDto> dtoSpCate = modelMapper.map(listSpTheoCate, new TypeToken<List<SanPhamDto>>() {}.getType());
        model.addAttribute("listSanPham", dtoSpCate);
        model.addAttribute("view", "sanPham/sanPham.jsp");
        return "layout";
    }

    @GetMapping("detail/{id}")
    public String detailSanPham(@PathVariable("id") String id, Model model){

        httpSession.setAttribute("uri_sanPham",request.getRequestURI());
        System.out.println("hiển thị uri : "+ httpSession.getAttribute("uri_sanPham"));
        ChiTietSanPham sp=  chiTietSanPhamQuanLy.findById(Integer.parseInt(id)).get();
        model.addAttribute("detail",sp);
        model.addAttribute("view", "sanPham/detail.jsp");
        return "layout";
    }
}

