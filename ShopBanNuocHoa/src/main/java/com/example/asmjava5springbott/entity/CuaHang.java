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

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cua_hang", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CuaHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "ma")
    private String ma;
    @Basic
    @Column(name = "ten")
    private String ten;
    @Basic
    @Column(name = "dia_chi")
    private String diaChi;
    @Basic
    @Column(name = "thanh_pho")
    private String thanhPho;
    @Basic
    @Column(name = "quoc_gia")
    private String quocGia;
    @OneToMany(mappedBy = "cuaHang")
    private Collection<NhanVien> nhanViens;

}