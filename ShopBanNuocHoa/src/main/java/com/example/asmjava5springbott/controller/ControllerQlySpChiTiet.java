package com.example.asmjava5springbott.controller;

import com.example.asmjava5springbott.dto.SanPhamDto;
import com.example.asmjava5springbott.entity.ChiTietSanPham;
import com.example.asmjava5springbott.entity.DongSanPham;
import com.example.asmjava5springbott.entity.MauSac;
import com.example.asmjava5springbott.entity.Nsx;
import com.example.asmjava5springbott.entity.SanPham;
import com.example.asmjava5springbott.service.IntefakeService.DongSanPhamService;
import com.example.asmjava5springbott.service.IntefakeService.MauSacService;
import com.example.asmjava5springbott.service.IntefakeService.NhasanXuatService;
import com.example.asmjava5springbott.service.IntefakeService.SanPhamService;
import com.example.asmjava5springbott.service.ipm.ChiTietSanPhamQuanLy;
import jakarta.servlet.ServletContext;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/quanLySanPhamChiTiet/")
public class ControllerQlySpChiTiet {
    @Autowired
    NhasanXuatService nhasanXuatService;

    @Autowired
    MauSacService mauSacService;

    @Autowired
    DongSanPhamService dongSanPhamService;
    @Autowired
    SanPhamService sanPhamService;

    @Autowired
    ChiTietSanPhamQuanLy chiTietSanPhamQuanLy;

    @Autowired
    ServletContext context;

    @Autowired
    ModelMapper modelMapper;
    int idNsx = 1;
    int idMau = 1;
    int idDongSp = 1;
    int idSanPham = 1;
    List<Nsx> listNhaSanXuat;
    List<SanPham> listSanPham;
    List<MauSac> lissMauSac;
    List<DongSanPham> listDongSp;
    List<ChiTietSanPham> listChiTietSp;
    List<ChiTietSanPham> getAllSanPham;

    @GetMapping("getspChiTiet")
    public String getSanPhamChiTiet(Model model) {
        listSanPham = sanPhamService.getAllSanPham();
        listNhaSanXuat = nhasanXuatService.getNhaSanXuat();
        lissMauSac = mauSacService.getMauSac();
        listDongSp = dongSanPhamService.getDongSanPham();
        listChiTietSp = chiTietSanPhamQuanLy.getChiTietSanPham();
        List<SanPhamDto> dtos = modelMapper.map(listChiTietSp, new TypeToken<List<SanPhamDto>>() {
        }.getType());
        //
        System.out.println("modelMapper" + dtos.size());
        model.addAttribute("nhaSx", listNhaSanXuat);
        model.addAttribute("mauSac", lissMauSac);
        model.addAttribute("dongSanPham", listDongSp);
        model.addAttribute("sanPham", listSanPham);
        model.addAttribute("chiTietSanp", dtos);
        model.addAttribute("idNsx", idNsx);
        model.addAttribute("idmauS", idMau);
        model.addAttribute("idDongS", idDongSp);
        model.addAttribute("idSanPham", idSanPham);
        //
        model.addAttribute("view", "sanPham/qLySanPhamChiTiet.jsp");
        return "layouAdm";
    }

    @PostMapping("save2")
    public String saveSanPhamandSanPhamChiTiet(@RequestParam("anh1") MultipartFile photo, @ModelAttribute("spChiTiet") ChiTietSanPham spChiTiet,
                                               @RequestParam("id1") String id1, Model model) {
        if (id1.equals("")) {
            System.out.println("là if");
            chiTietSanPhamQuanLy.saveChiTietSanPhamTach(photo, spChiTiet);
        } else {
            System.out.println("chắn chắn đây rồi");
            spChiTiet.setId(Integer.parseInt(id1));
            chiTietSanPhamQuanLy.saveChiTietSanPhamTach(photo, spChiTiet);
        }
        return "redirect:/quanLySanPhamChiTiet/getspChiTiet";
    }

    @GetMapping("edit/{id}")
    public String detailSanPhamChiTiet(@PathVariable("id") int id, Model model) {
        ChiTietSanPham sp = chiTietSanPhamQuanLy.findById(id).get();

        model.addAttribute("detail", sp);
        model.addAttribute("nhaSx", listNhaSanXuat);
        model.addAttribute("mauSac", lissMauSac);
        model.addAttribute("dongSanPham", listDongSp);
        model.addAttribute("sanPham", listSanPham);
        model.addAttribute("chiTietSanp", listChiTietSp);

        model.addAttribute("idNsx", sp.getNsx().getId());
        model.addAttribute("idmauS", sp.getMauSac().getId());
        model.addAttribute("idDongS", sp.getDongSanPham().getId());
        model.addAttribute("idSanPham", sp.getSanPham().getId());
        //
        model.addAttribute("view", "sanPham/qLySanPhamChiTiet.jsp");
        return "layouAdm";
    }

    @GetMapping("remove/{id}")
    public String deleteSanPhamChiTiet(@PathVariable("id") int id, Model model) {
        chiTietSanPhamQuanLy.delete(id);
        return "redirect:/quanLySanPhamChiTiet/getspChiTiet";
    }
}
