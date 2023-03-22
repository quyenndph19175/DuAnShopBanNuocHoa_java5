package com.example.asmjava5springbott.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "khach_hang", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "ma")
    private String ma;
    @Basic
    @Column(name = "ho_ten")
    private String hoTen;
    @Basic
    @Column(name = "ngay_sinh")
    private Date ngaySinh;
    @Basic
    @Column(name = "sdt")
    private String sdt;
    @Basic
    @Column(name = "dia_chi")
    private String diaChi;
    @Basic
    @Column(name = "mat_khau")
    private String matKhau;
    @OneToMany(mappedBy = "khachHang")
    private Collection<GioHang> gioHangs;
    @OneToMany(mappedBy = "khachHang")
    private Collection<HoaDon> hoaDons;

    public KhachHang(int id) {
        this.id = id;
    }
}