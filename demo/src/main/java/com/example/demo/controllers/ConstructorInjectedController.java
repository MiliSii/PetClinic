package com.example.demo.controllers;

import com.example.demo.services.MyService;

public class ConstructorInjectedController {
    //the most preferred method
    private final MyService myService;

    public ConstructorInjectedController(MyService myService) {
        this.myService = myService;
    }

    public String getGreeting(){
        return myService.sayGreeting();
    }
}
