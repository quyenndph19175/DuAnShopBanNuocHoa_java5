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
@RequestMapping("/quanLySanPham/")
public class ControllerQuanLySanPham {

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

    List<Nsx> listNhaSanXuat;
    List<MauSac> lissMauSac;
    List<DongSanPham> listDongSp;
    List<ChiTietSanPham> listChiTietSp;

    @GetMapping("getSanPham")
    public String hienThiSanPham(Model model) {
        listNhaSanXuat = nhasanXuatService.getNhaSanXuat();
        lissMauSac = mauSacService.getMauSac();
        listDongSp = dongSanPhamService.getDongSanPham();
        listChiTietSp = chiTietSanPhamQuanLy.getChiTietSanPham();
        //
        List<SanPhamDto> dtos = modelMapper.map(listChiTietSp, new TypeToken<List<SanPhamDto>>() {
        }.getType());
        model.addAttribute("nhaSx", listNhaSanXuat);
        model.addAttribute("mauSac", lissMauSac);
        model.addAttribute("dongSanPham", listDongSp);
        model.addAttribute("chiTietSanp", dtos);
        model.addAttribute("idNsx", idNsx);
        model.addAttribute("idmauS", idMau);
        model.addAttribute("idDongS", idDongSp);
        model.addAttribute("view", "sanPham/createSanPham.jsp");

        return "layouAdm";
    }

    @PostMapping("save2")
    public String saveSanPhamandSanPhamChiTiet(@RequestParam("anh1") MultipartFile photo, @ModelAttribute("spChiTiet") ChiTietSanPham spChiTiet,
                                               @ModelAttribute("sp") SanPham sanPham, @RequestParam("idsp1") String id, @RequestParam("id1") String id1, Model model) {

        if (id.equals("")) {
            System.out.println("là if");
            //add sản phẩm trước
            sanPhamService.saveSanPham(sanPham);
            // lấy id sp vừa add in sản phẩm chi tiết
            int cout = sanPhamService.idSanPham(sanPham.getMa());
            spChiTiet.setSanPham(new SanPham(cout));
            chiTietSanPhamQuanLy.saveChiTietSanPham(photo, spChiTiet, sanPham);
        } else {
            System.out.println("chắn chắn đây rồi");
            //add sản phẩm trước
            sanPham.setId(Integer.parseInt(id));
            sanPhamService.saveSanPham(sanPham);
            // lấy id sp vừa add in sản phẩm chi tiết
            int cout = sanPhamService.idSanPham(sanPham.getMa());
            spChiTiet.setId(Integer.parseInt(id1));
            spChiTiet.setSanPham(new SanPham(cout));
            chiTietSanPhamQuanLy.saveChiTietSanPham(photo, spChiTiet, sanPham);
        }
        return "redirect:/quanLySanPham/getSanPham";
    }

    @GetMapping("remove/{idct}/{idsp}")
    public String deleteSanPham(@PathVariable("idct") Integer idct, @PathVariable("idsp") Integer idsp) {
        chiTietSanPhamQuanLy.delete(idct);
        sanPhamService.delete(idsp);
        return "redirect:/quanLySanPham/getSanPham";
    }

    @GetMapping("edit/{id}")
    public String dtailSanPhamChiTiet(@PathVariable("id") int id, Model model) {

        ChiTietSanPham sp = chiTietSanPhamQuanLy.findById(id).get();

        model.addAttribute("detail", sp);
        model.addAttribute("nhaSx", listNhaSanXuat);
        model.addAttribute("mauSac", lissMauSac);
        model.addAttribute("dongSanPham", listDongSp);
        model.addAttribute("chiTietSanp", listChiTietSp);
        // addAttibute ID
        model.addAttribute("idNsx", sp.getNsx().getId());
        model.addAttribute("idmauS", sp.getMauSac().getId());
        model.addAttribute("idDongS", sp.getDongSanPham().getId());
        model.addAttribute("view", "sanPham/createSanPham.jsp");
        return "layouAdm";
    }

}
