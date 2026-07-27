package com.example.kisansakthi.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "subsidy")
public class Subsidy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "scheme_name")
    private String schemeName;

    private String category;

    @Column(name = "government_rate")
    private Double governmentRate;

    @Column(name = "market_rate")
    private Double marketRate;

    @Column(name = "farmer_price")
    private Double farmerPrice;

    private String district;

    private String mandal;

    private String description;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "last_date")
    private LocalDate lastDate;

    @Column(name = "required_documents")
    private String requiredDocuments;

    private String eligibility;

    public Subsidy() {
    }

    public Subsidy(Integer id,
            String schemeName,
            String category,
            Double governmentRate,
            Double marketRate,
            Double farmerPrice,
            String district,
            String mandal,
            String description,
            LocalDate startDate,
            LocalDate lastDate,
            String requiredDocuments,
            String eligibility) {

        this.id = id;
        this.schemeName = schemeName;
        this.category = category;
        this.governmentRate = governmentRate;
        this.marketRate = marketRate;
        this.farmerPrice = farmerPrice;
        this.district = district;
        this.mandal = mandal;
        this.description = description;
        this.startDate = startDate;
        this.lastDate = lastDate;
        this.requiredDocuments = requiredDocuments;
        this.eligibility = eligibility;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getGovernmentRate() {
        return governmentRate;
    }

    public void setGovernmentRate(Double governmentRate) {
        this.governmentRate = governmentRate;
    }

    public Double getMarketRate() {
        return marketRate;
    }

    public void setMarketRate(Double marketRate) {
        this.marketRate = marketRate;
    }

    public Double getFarmerPrice() {
        return farmerPrice;
    }

    public void setFarmerPrice(Double farmerPrice) {
        this.farmerPrice = farmerPrice;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMandal() {
        return mandal;
    }

    public void setMandal(String mandal) {
        this.mandal = mandal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    public String getRequiredDocuments() {
        return requiredDocuments;
    }

    public void setRequiredDocuments(String requiredDocuments) {
        this.requiredDocuments = requiredDocuments;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }
}