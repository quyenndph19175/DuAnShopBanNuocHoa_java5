package com.example.asmjava5springbott.service.ipm;

import com.example.asmjava5springbott.entity.Nsx;
import com.example.asmjava5springbott.repository.NhasanXuatRepo;
import com.example.asmjava5springbott.service.IntefakeService.NhasanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhaSanXuatService implements NhasanXuatService {

    @Autowired
    NhasanXuatRepo nhasanXuatRepo;
    @Override
    public List<Nsx> getNhaSanXuat() {
        return nhasanXuatRepo.findAll();
    }
}
