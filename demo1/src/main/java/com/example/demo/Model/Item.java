package com.example.demo.Model;

public class Item {

    private String name;
    private String description;
    private String rank;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return  "\n [ITEM_NAME]: " + getName() + "\n" +
                " [ITEM_DESCRIPTION]: " + getDescription() +
                "[ITEM_RANK: ]" + getRank();
    }
}
