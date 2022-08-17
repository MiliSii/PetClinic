package com.example.demo.controllers;

import com.example.demo.services.MyService;

public class PropertyInjectedController {
    public MyService myService;
//manually creating dependency injections
    //the least preferred method
    public String getGreeting(){
        return myService.sayGreeting();
        // create junit test
    }
}
