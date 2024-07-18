package com.example.demo.Model;



public class Version {

    private String name;
    private String version;
    private Item item;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Version{" +
                "name='" + getName() + '\'' +
                ", version='" + getVersion() + '\'' +
                ", item=" + getItem() +
                '}';
    }
}
