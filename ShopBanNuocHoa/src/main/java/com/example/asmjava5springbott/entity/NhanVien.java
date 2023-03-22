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

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "nhan_vien", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {
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
    @Column(name = "gioi_tinh")
    private String gioiTinh;
    @Basic
    @Column(name = "ngay_sinh")
    private Date ngaySinh;
    @Basic
    @Column(name = "dia_chi")
    private String diaChi;
    @Basic
    @Column(name = "mat_khau")
    private String matKhau;
    @Basic
    @Column(name = "trangthai")
    private Integer trangthai;
    @OneToMany(mappedBy = "nhanVien")
    private Collection<GioHang> gioHangs;
    @OneToMany(mappedBy = "nhanVien")
    private Collection<HoaDon> hoaDons;
    @ManyToOne
    @JoinColumn(name = "cuahang_id", referencedColumnName = "id")
    private CuaHang cuaHang;
    @ManyToOne
    @JoinColumn(name = "chucvu_id", referencedColumnName = "id")
    private ChucVu chucVu;

}
