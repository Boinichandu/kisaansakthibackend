package com.example.kisansakthi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.kisansakthi.model.MarketPrice;
import com.example.kisansakthi.service.MarketPriceService;

@RestController
@RequestMapping("/market-prices")
@CrossOrigin(origins = "*")
public class MarketPriceController {

    @Autowired
    private MarketPriceService marketPriceService;

    // Get all market prices
    @GetMapping
    public List<MarketPrice> getAllMarketPrices() {
        return marketPriceService.getAllMarketPrices();
    }

    // Get market price by crop name
    @GetMapping("/{cropName}")
    public MarketPrice getMarketPriceByCropName(@PathVariable String cropName) {
        return marketPriceService.getMarketPriceByCropName(cropName);
    }

    // Add new market price
    @PostMapping
    public MarketPrice addMarketPrice(@RequestBody MarketPrice marketPrice) {
        return marketPriceService.addMarketPrice(marketPrice);
    }

    // Update market price
    @PutMapping("/{id}")
    public MarketPrice updateMarketPrice(@PathVariable Integer id,
            @RequestBody MarketPrice marketPrice) {

        return marketPriceService.updateMarketPrice(id, marketPrice);
    }

    // Delete market price
    @DeleteMapping("/{id}")
    public String deleteMarketPrice(@PathVariable Integer id) {

        marketPriceService.deleteMarketPrice(id);

        return "Market price deleted successfully.";
    }
}