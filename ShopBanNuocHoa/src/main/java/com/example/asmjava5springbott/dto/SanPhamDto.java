package com.example.asmjava5springbott.dto;

import com.example.asmjava5springbott.entity.DongSanPham;
import com.example.asmjava5springbott.entity.MauSac;
import com.example.asmjava5springbott.entity.Nsx;
import com.example.asmjava5springbott.entity.SanPham;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamDto {
    private int id;
    private SanPham sanPham;
    private Nsx nsx;
    private MauSac mauSac;
    private DongSanPham dongSanPham;
    private int namBaoHanh;
    private String moTa;
    private String anh;
    private Integer giaNhap;
    private Integer giaBan;
    private Integer soLuongTon;
    private String mauSacTen;
}
