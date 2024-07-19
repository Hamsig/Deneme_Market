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

            // itemi data base e ekle

            //sonra geri döndür

            return "item added";
        } else {

            // data base

            // item varmı kontroll et

            // varsa geri item ı döndür

            return "item";
        }
    }
}
