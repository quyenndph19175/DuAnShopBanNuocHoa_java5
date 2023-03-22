package com.example.asmjava5springbott.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity
@Table(name = "chi_tiet_san_pham", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSanPham {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "nam_bao_hanh")
    private Integer namBaoHanh;

    @Basic
    @Column(name = "mo_ta")
    private String moTa;

    @Basic
    @Column(name = "so_luong_ton")
    private Integer soLuongTon;

    @Basic
    @Column(name = "gia_nhap")
    private Integer giaNhap;

    @Basic
    @Column(name = "gia_ban")
    private Integer giaBan;

    @Basic
    @Column(name = "anh")
    private String anh;

    @ManyToOne
    @JoinColumn(name = "sanpham_id")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "nsx_id")
    private Nsx nsx;

    @ManyToOne
    @JoinColumn(name = "mausac_id")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "dongsanpham_id", referencedColumnName = "id")
    private DongSanPham dongSanPham;

    @OneToMany(mappedBy = "chiTietSanPham")
    private Collection<GioHangChiTiet> gioHangChiTiets;

    @OneToMany(mappedBy = "chiTietSanPham")
    private Collection<HoaDonChiTiet> hoaDonChiTiets;

    public ChiTietSanPham(int id) {
        this.id = id;
    }
}