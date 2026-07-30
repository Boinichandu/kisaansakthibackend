package com.example.kisansakthi.model;

public class FarmingTip {

    private int id;
    private String cropName;
    private String category;
    private String stage;
    private String title;
    private String description;

    public FarmingTip() {
    }

    public FarmingTip(int id, String cropName, String category,
            String stage, String title, String description) {
        this.id = id;
        this.cropName = cropName;
        this.category = category;
        this.stage = stage;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}