package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepo extends JpaRepository<MauSac,Integer> {
}
