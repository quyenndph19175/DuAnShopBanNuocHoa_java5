package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.entity.KhachHang;
import com.example.asmjava5springbott.service.ipm.KhachHangService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlerChangPass {
    @Autowired
    private HttpSession httpSession;
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("/user/login/doimatkhau/hienthi")
    public String changPassWord(Model model) {
        model.addAttribute("maKH", httpSession.getAttribute("maUsr"));
        model.addAttribute("view", "login/changepassword.jsp");
        return "layout";
    }

    @PostMapping("/user/login/doimatkhau")
    public String doiPass(@RequestParam("matkhau") String mk, @RequestParam("matKhau1") String comfim, Model model) {
        String a = httpSession.getAttribute("idKh").toString();
        KhachHang kh = khachHangService.findHdById(Integer.parseInt(a)).get();
        System.out.println("mk" + mk);
        System.out.println("comfim" + comfim);
        if (!mk.equals(comfim)) {
            System.out.println("1");
            model.addAttribute("mes", "Mật Khẩu Không Khớp");
            model.addAttribute("maKH", httpSession.getAttribute("maUsr"));
            model.addAttribute("view", "login/changepassword.jsp");
            return "layout";
        } else if (comfim.equals(kh.getMatKhau())) {
            model.addAttribute("mes", "Không Sử dụng mật khẩu cũ");
            model.addAttribute("maKH", httpSession.getAttribute("maUsr"));
            model.addAttribute("view", "login/changepassword.jsp");
            System.out.println("2");
            return "layout";
        } else {
            System.out.println("3");
            kh.setMatKhau(comfim);
            khachHangService.saveKhachHang(kh);


        }
        httpSession.removeAttribute("username");
        httpSession.removeAttribute("redirect-uri");
        httpSession.removeAttribute("uri_sanPham");
        return "redirect:/login/user";
    }
}
