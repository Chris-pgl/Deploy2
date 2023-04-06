package com.example.Deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/test")
public class BasicControler {



    @GetMapping("/sum")
    public int getSum(){
        Random r = new Random();
        int x = r.nextInt();
        int y = r.nextInt();
        int sum = x + y;
        return sum;
    }



}
