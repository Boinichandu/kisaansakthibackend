package com.example.kisansakthi.service;

import com.example.kisansakthi.model.FarmingTip;
import com.example.kisansakthi.repository.FarmingTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmingTipServiceImplement implements FarmingTipService {

    @Autowired
    private FarmingTipRepository farmingTipRepository;

    @Override
    public List<FarmingTip> getTipsByCrop(String cropName) {

        return farmingTipRepository.getTipsByCrop(cropName);

    }
}