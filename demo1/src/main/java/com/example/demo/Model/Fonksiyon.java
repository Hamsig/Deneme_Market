package com.example.demo.Model;

import java.sql.*;
import java.util.Properties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import com.example.demo.Model.Item;

public class Fonksiyon {


    private Integer id;
    private String name;
    private String version;
    private int owner_id;
    protected Item item;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getOwnerId() { return owner_id; }

    public int getId() { return id; }

    public Item getItem() { return item; }

    @Override
    public String toString() {
        return "Fonksiyon{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", owner_id=" + owner_id +
                ", ID=" + id;
    }
}

