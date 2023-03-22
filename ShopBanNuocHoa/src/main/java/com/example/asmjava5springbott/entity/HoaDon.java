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

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "hoa_don", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "ma")
    private String ma;
    @Basic
    @Column(name = "ngay_tao")
    private Timestamp ngayTao;
    @Basic
    @Column(name = "ngay_thanh_toan")
    private Timestamp ngayThanhToan;
    @Basic
    @Column(name = "ngay_ship")
    private Timestamp ngayShip;
    @Basic
    @Column(name = "ngay_nhan")
    private Timestamp ngayNhan;
    @Basic
    @Column(name = "tinh_trang")
    private Integer tinhTrang;
    @Basic
    @Column(name = "ten_nguoi_nhan")
    private String tenNguoiNhan;
    @Basic
    @Column(name = "dia_chi")
    private String diaChi;
    @Basic
    @Column(name = "sdt")
    private String sdt;
    @ManyToOne
    @JoinColumn(name = "nhanvien_id", referencedColumnName = "id")
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name = "khachhang_id", referencedColumnName = "id")
    private KhachHang khachHang;
    @OneToMany(mappedBy = "hoaDon")
    private Collection<HoaDonChiTiet> hoaDonChiTiets;

    public HoaDon(int id) {
        this.id = id;
    }
}