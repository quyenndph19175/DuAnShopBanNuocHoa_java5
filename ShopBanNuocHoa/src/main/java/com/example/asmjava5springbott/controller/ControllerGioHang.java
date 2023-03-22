package com.example.asmjava5springbott.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/gioHang/")
public class ControllerGioHang {
    @GetMapping("hienThi")
    public String hienThiGioHang(Model model){
        model.addAttribute("view", "sanPham/gioHang.jsp");
        return "layout";
    }

}
