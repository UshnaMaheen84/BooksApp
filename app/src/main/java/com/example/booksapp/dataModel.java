package com.example.booksapp;

public class dataModel {

    public int imageId;
    public String name, desc, pdf;

    public dataModel( String pdf, int imageId, String name, String desc) {
        this.imageId = imageId;
        this.name = name;
        this.desc = desc;
        this.pdf = pdf;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }
}
