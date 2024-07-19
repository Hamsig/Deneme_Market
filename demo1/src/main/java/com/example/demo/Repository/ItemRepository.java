package com.example.demo.Repository;

import com.example.demo.Model.Fonksiyon;
import com.example.demo.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {

    public Item findItemById(Integer id);



}
