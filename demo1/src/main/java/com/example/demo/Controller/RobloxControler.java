package com.example.demo.Controller;

import com.example.demo.Model.Fonksiyon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Version;

@RestController
public class RobloxControler {


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
}
