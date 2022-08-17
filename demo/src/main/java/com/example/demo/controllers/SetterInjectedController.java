package com.example.demo.controllers;

import com.example.demo.services.MyService;

public class SetterInjectedController {

    private MyService myService;

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public String getGreeting(){
        return myService.sayGreeting();
    }
}
