package com.example.asmjava5springbott.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "gio_hang_chi_tiet", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GioHangChiTiet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "so_luong")
    private Integer soLuong;
    @Basic
    @Column(name = "don_gia")
    private Integer donGia;
    @Basic
    @Column(name = "don_gia_khi_gia")
    private Integer donGiaKhiGia;
    @ManyToOne
    @JoinColumn(name = "giohangchitiet_giohang", referencedColumnName = "id")
    private GioHang gioHang;
    @ManyToOne
    @JoinColumn(name = "giohangchitiet_chitietsanpham", referencedColumnName = "id")
    private ChiTietSanPham chiTietSanPham;

}