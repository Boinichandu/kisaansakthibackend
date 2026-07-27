package com.example.kisansakthi.controller;

import com.example.kisansakthi.model.FarmingTip;
import com.example.kisansakthi.service.FarmingTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class FarmingTipController {

    @Autowired
    private FarmingTipService farmingTipService;

    @GetMapping("/farming-tips/{crop}")

    public List<FarmingTip> getTips(

            @PathVariable String crop

    ) {

        return farmingTipService.getTipsByCrop(crop);

    }

}