package com.example.kisansakthi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "expert")
public class Expert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "expert_name")
    private String expertName;

    private String specialization;

    private String district;

    private String mandal;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    @Column(name = "office_name")
    private String officeName;

    @Column(name = "available_days")
    private String availableDays;

    @Column(name = "available_time")
    private String availableTime;

    public Expert() {
    }

    public Expert(Integer id,
            String expertName,
            String specialization,
            String district,
            String mandal,
            String phoneNumber,
            String email,
            String officeName,
            String availableDays,
            String availableTime) {

        this.id = id;
        this.expertName = expertName;
        this.specialization = specialization;
        this.district = district;
        this.mandal = mandal;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.officeName = officeName;
        this.availableDays = availableDays;
        this.availableTime = availableTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(String availableDays) {
        this.availableDays = availableDays;
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }
}