package com.example.kisansakthi.repository;

import com.example.kisansakthi.model.FarmingTip;

import java.util.List;

public interface FarmingTipRepository {

    List<FarmingTip> getTipsByCrop(String cropName);

}