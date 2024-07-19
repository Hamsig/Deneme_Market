package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
public class Item {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(
            name = "'name'"
    )
    private String name;

    @Column(
            name = "'description'"

    )
    private String description;

    @Column(
            name = "'rank'"
    )
    private String rank;


    public Item() {
    }

    public Item(Integer id, String name, String description, String rank) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rank = rank;
    }

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
                " [ITEM_DESCRIPTION]: " + getDescription() + "\n" +
                " [ITEM_RANK]: " + getRank();
    }
}
