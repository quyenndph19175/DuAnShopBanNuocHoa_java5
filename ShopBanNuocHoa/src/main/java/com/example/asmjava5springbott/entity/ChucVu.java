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
@Table(name = "chuc_vu", schema = "ass_sof3021", catalog = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChucVu {
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
    @OneToMany(mappedBy = "chucVu")
    private Collection<NhanVien> nhanViens;

}
