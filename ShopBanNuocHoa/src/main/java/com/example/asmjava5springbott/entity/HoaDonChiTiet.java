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
@Table(name = "hoa_don_chi_tiet", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonChiTiet {
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
    @ManyToOne
    @JoinColumn(name = "hoadonchitiet_hoadon", referencedColumnName = "id")
    private HoaDon hoaDon;
    @ManyToOne
    @JoinColumn(name = "hoadonchitiet_chitietsanpham", referencedColumnName = "id")
    private ChiTietSanPham chiTietSanPham;

}