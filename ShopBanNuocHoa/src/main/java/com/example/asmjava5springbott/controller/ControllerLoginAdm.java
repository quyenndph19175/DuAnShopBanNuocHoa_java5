package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.entity.NhanVien;
import com.example.asmjava5springbott.service.ipm.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.plaf.PanelUI;

@Controller
@RequestMapping("/login/")
public class ControllerLoginAdm {
    @Autowired
    LoginService loginService;
    @Autowired
    private HttpSession httpSession;

    @GetMapping("adm")
    public String giaoDienlogAdn() {
        return "login/loginAdm";
    }

    @PostMapping("checkAdm")
    public String checkLoginQuanLy(@ModelAttribute("ql") NhanVien dto, Model model) {

        NhanVien kh = loginService.checkLoginNhanVien(dto.getMa(), dto.getMatKhau());
        if (kh == null) {
            model.addAttribute("mes", "Sai mật khẩu hoặc tài khoản");
            return "login/loginAdm";
        }
        httpSession.setAttribute("username", kh.getHoTen());
        httpSession.setAttribute("idKh", kh.getId());
        return "redirect:/quanLySanPham/getSanPham";
    }

    @GetMapping("forgotPassword")
    public String forgotPassword() {
        return "login/quenMk";
    }
}
