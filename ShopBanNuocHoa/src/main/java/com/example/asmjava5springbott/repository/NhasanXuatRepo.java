package com.example.asmjava5springbott.repository;

import com.example.asmjava5springbott.entity.Nsx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhasanXuatRepo extends JpaRepository<Nsx,Integer> {
}
