package com.example.kisansakthi.service;

import com.example.kisansakthi.model.FarmingTip;

import java.util.List;

public interface FarmingTipService {

    List<FarmingTip> getTipsByCrop(String cropName);

}