package com.example.kisansakthi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kisansakthi.model.MarketPrice;

@Repository
public interface MarketPriceRepository extends JpaRepository<MarketPrice, Integer> {

    Optional<MarketPrice> findByCropName(String cropName);

}