package com.example.kisansakthi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "market_price")
public class MarketPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "crop_name")
    private String cropName;

    @Column(name = "market_name")
    private String marketName;

    @Column(name = "price_per_quintal")
    private Double pricePerQuintal;

    private String unit;

    private String district;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    public MarketPrice() {
    }

    public MarketPrice(Integer id, String cropName, String marketName, String district,
            Double pricePerQuintal, String unit,
            LocalDateTime lastUpdated) {
        this.id = id;
        this.cropName = cropName;
        this.marketName = marketName;
        this.district = district;
        this.pricePerQuintal = pricePerQuintal;
        this.unit = unit;
        this.lastUpdated = lastUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Double getPricePerQuintal() {
        return pricePerQuintal;
    }

    public void setPricePerQuintal(Double pricePerQuintal) {
        this.pricePerQuintal = pricePerQuintal;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}