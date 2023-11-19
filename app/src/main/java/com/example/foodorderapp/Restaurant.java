package com.example.foodorderapp;

public class Restaurant {
    private int id;
    private String name;
    private String description;

    // Constructors

    public Restaurant(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    // getters, and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


