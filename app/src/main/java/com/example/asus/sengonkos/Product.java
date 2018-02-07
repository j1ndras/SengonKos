package com.example.asus.sengonkos;

/**
 * Created by ASUS on 2/7/2018.
 */

public class Product {
    private int id;
    private String title, shortdesc, type;
    private int image;

    public Product(int id, String title, String shortdesc, String type, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.type = type;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }
}
