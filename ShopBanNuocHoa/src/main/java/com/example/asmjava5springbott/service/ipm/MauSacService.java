package com.example.asmjava5springbott.service.ipm;


import com.example.asmjava5springbott.entity.MauSac;
import com.example.asmjava5springbott.repository.MauSacRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MauSacService implements com.example.asmjava5springbott.service.IntefakeService.MauSacService {

    @Autowired
    MauSacRepo mauSacRepo;
    @Override
    public List<MauSac> getMauSac() {
        return mauSacRepo.findAll();
    }
}
