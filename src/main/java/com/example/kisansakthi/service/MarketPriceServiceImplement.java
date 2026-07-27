package com.example.kisansakthi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kisansakthi.model.MarketPrice;
import com.example.kisansakthi.repository.MarketPriceRepository;

@Service
public class MarketPriceServiceImplement implements MarketPriceService {

    @Autowired
    private MarketPriceRepository marketPriceRepository;

    @Override
    public List<MarketPrice> getAllMarketPrices() {
        return marketPriceRepository.findAll();
    }

    @Override
    public MarketPrice getMarketPriceByCropName(String cropName) {

        return marketPriceRepository.findByCropName(cropName)
                .orElseThrow(() -> new RuntimeException("Crop not found"));
    }

    @Override
    public MarketPrice addMarketPrice(MarketPrice marketPrice) {

        return marketPriceRepository.save(marketPrice);
    }

    @Override
    public MarketPrice updateMarketPrice(Integer id, MarketPrice marketPrice) {

        MarketPrice existingMarketPrice = marketPriceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Market price not found"));

        existingMarketPrice.setCropName(marketPrice.getCropName());
        existingMarketPrice.setMarketName(marketPrice.getMarketName());
        existingMarketPrice.setPricePerQuintal(marketPrice.getPricePerQuintal());
        existingMarketPrice.setUnit(marketPrice.getUnit());

        return marketPriceRepository.save(existingMarketPrice);
    }

    @Override
    public void deleteMarketPrice(Integer id) {

        if (!marketPriceRepository.existsById(id)) {
            throw new RuntimeException("Market price not found");
        }

        marketPriceRepository.deleteById(id);
    }
}