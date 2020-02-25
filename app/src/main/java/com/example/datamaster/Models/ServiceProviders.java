package com.example.datamaster.Models;

public class ServiceProviders {
    private int id,img;
    private String name;

    public ServiceProviders(int id, int img, String name) {
        this.id = id;
        this.img = img;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}
