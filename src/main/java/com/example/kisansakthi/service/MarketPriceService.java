package com.example.kisansakthi.service;

import java.util.List;

import com.example.kisansakthi.model.MarketPrice;

public interface MarketPriceService {

    // Get all market prices
    List<MarketPrice> getAllMarketPrices();

    // Get market price by crop name
    MarketPrice getMarketPriceByCropName(String cropName);

    // Add new market price
    MarketPrice addMarketPrice(MarketPrice marketPrice);

    // Update market price
    MarketPrice updateMarketPrice(Integer id, MarketPrice marketPrice);

    // Delete market price
    void deleteMarketPrice(Integer id);

}