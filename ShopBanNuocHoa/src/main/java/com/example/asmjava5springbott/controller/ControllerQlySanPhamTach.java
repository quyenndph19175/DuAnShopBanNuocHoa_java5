package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.entity.SanPham;
import com.example.asmjava5springbott.service.ipm.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/quanLySanPhamTach/")
public class ControllerQlySanPhamTach {
    @Autowired
    SanPhamService sanPhamService;
    List<SanPham> getSanPham;

    @GetMapping("getHienThisp")
    public String hienThiSanPham(Model model) {
        getSanPham = sanPhamService.getAllSanPham();
        model.addAttribute("getSanPham", getSanPham);
        model.addAttribute("view", "sanPham/qlSanPhamTach.jsp");
        return "layouAdm";
    }

    @GetMapping("edit/{id}")
    public String getDetail(@PathVariable("id") String id, Model model) {
        SanPham sp = sanPhamService.findById(Integer.parseInt(id)).get();
        model.addAttribute("detail", sp);
        model.addAttribute("getSanPham", getSanPham);
        model.addAttribute("view", "sanPham/qlSanPhamTach.jsp");
        return "layouAdm";
    }

    @PostMapping("Save")
    public String saveSanPham(@ModelAttribute("sp") SanPham sanPham, @RequestParam("idsp1") String id, Model model) {
        if (id.equals("")) {
            sanPhamService.saveSanPham(sanPham);
        } else {
            sanPham.setId(Integer.parseInt(id));
            sanPhamService.saveSanPham(sanPham);
        }
        return "redirect:/quanLySanPhamTach/getHienThisp";
    }
}
