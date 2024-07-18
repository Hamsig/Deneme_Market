package com.example.demo.Model;



public class Version {

    private String name;
    private String version;


    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }


    @Override
    public String toString() {
        return "Name" + getName() + " Version" + getVersion();
    }
}
