package com.example.demo.Model;

public class Item {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "name: " + getName() + " description:" + getDescription();
    }
}
