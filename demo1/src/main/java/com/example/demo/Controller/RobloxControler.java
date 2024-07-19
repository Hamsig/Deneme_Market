package com.example.demo.Controller;


import com.example.demo.Model.Fonksiyon;
import com.example.demo.Model.Item;
import com.example.demo.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Version;



@RestController
public class RobloxControler {


    @Autowired
    ItemRepository repository;

    @GetMapping("/test")
    public String test() {

        return "Hello World222222222";

    }
    @PostMapping("/test2")
    public String test2(@RequestBody Version data) {

        System.out.println(data.toString());

        return data.toString();

    }

    @PostMapping("/test3")
    public String test3(@RequestBody Fonksiyon data) {

        System.out.println(data.toString());

        return data.toString();

    }
    @PostMapping("/addItem")
    public String addItem(@RequestBody Item data) {

        repository.save(data);
        Item i =  repository.findItemById(2);
        System.out.println(i.toString());
        return data.toString();

    }
}




