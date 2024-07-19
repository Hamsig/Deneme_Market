package com.example.demo.Model;

public class Fonksiyon {

        private String name;

    public String getName() {
        return name;
    }

    public String Task() {
        boolean b = name.equals("item-add");

        if (b == true) {

            // data base

            return "item added";
        } else {

            // data base

            return "item";
        }
    }
}
