package com.example.demo.Model;

public class Fonksiyon {

    private String task;
    private Item item;

    public String getTask() {
        return task;
    }

    public Item getItem() {
        return item;
    }

    public Item Am() {
        boolean b = getTask().equals("set");

        if (b == true) {


            return getItem(); // kardeşş burayı değiştir
        }else {

            return getItem();
        }
    }
}
