package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.entity.GioHang;
import com.example.asmjava5springbott.entity.KhachHang;
import com.example.asmjava5springbott.service.ipm.GioHangService;
import com.example.asmjava5springbott.service.ipm.KhachHangService;
import com.example.asmjava5springbott.service.ipm.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequestMapping("/login/")
public class ControllerLoginUser {
    @Autowired
    LoginService loginService;
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    GioHangService gioHangService;
    @Autowired
    private HttpSession httpSession;
    String layuri;

    @GetMapping("user")
    public String loginGiaoDien() {
        return "login/login";
    }

    @PostMapping("checkLogin")
    public String chekLoginUser(@ModelAttribute("user") KhachHang dto, Model model) {

        KhachHang kh = loginService.checkLoginKhachHang(dto.getMa(), dto.getMatKhau());
        System.out.println("Gì ấu sao vào đay");
        if (kh == null) {
            model.addAttribute("mes", "Sai Tài khoản hoặc mật khẩu");
            System.out.println("Gì ấu sao vào đay");
            return "login/login";
        }
        httpSession.setAttribute("username", kh.getHoTen());
        httpSession.setAttribute("idKh", kh.getId());
        httpSession.setAttribute("maUsr", kh.getMa());
        Object uri = httpSession.getAttribute("redirect-uri");

        // cắt chuỗi để lấy uri
        try {
            String[] splits = uri.toString().split("\\d+");
            StringBuilder stringBuilder = new StringBuilder();
            for (String item : splits)
                stringBuilder.append(item);
            System.out.println(stringBuilder.toString());
            layuri = stringBuilder.toString();

            //check khi mua hàng
            if (layuri.equals("/user/produc/buy/")) {
                System.out.println("đường dẫn: " + uri.toString());
                System.out.println("Khác null");
                return "redirect:" + httpSession.getAttribute("uri_sanPham");
            }

        } catch (Exception e) {
        }
        //check nếu uri khác null
        if (uri != null) {
            return "redirect:" + uri;
        } else {
            model.addAttribute("view", "home.jsp");
            return "redirect:/home/hienThi";
        }
    }
    // Tạo tài khoản
    @GetMapping("createAcc")
    public String giaoDienCreateAcc() {
        return "login/createAcc";
    }

    @PostMapping("createAcc/save")
    public String createAcc(@ModelAttribute("kh") KhachHang khachHang, @RequestParam("matKhau1") String comfim, Model model) {
        if (khachHang.getMatKhau().equals(comfim)) {
            khachHangService.saveKhachHang(khachHang);
            System.out.println("khách hàng id" + khachHangService.getIdKhachHang());
            int idkh = khachHangService.getIdKhachHang();
            // khi tạo 1 tk thì sẽ tạo luôn giỏ hàng
            GioHang gh = new GioHang();
            gh.setKhachHang(new KhachHang(idkh));
            gioHangService.saveGioHang(gh);
            model.addAttribute("taiKhoan", khachHang.getMa());
            model.addAttribute("matkhaus", khachHang.getMatKhau());
            System.out.println(" ma kh" + khachHang.getMa());
            System.out.println(" ma kh" + khachHang.getMatKhau());
            return "login/login";
        } else {
            model.addAttribute("mes", "Mật khẩu không khớp");
            model.addAttribute("create", khachHang);
            return "login/createAcc";
        }
    }
}
