package com.example.demo.controllers;

import com.example.demo.services.MyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//And then finally on the constructor, since that constructor is a only way to instantiate this, we don't
//have to tell Spring explicitly to utilize the constructor. Here it's automatically going to auto-wire.
//So we don't have to provide the auto-wire annotation.

@Controller
public class ConstructorInjectedController {
    //the most preferred method
    private final MyService myService;

    //@Autowired is optional in constructor
    public ConstructorInjectedController(@Qualifier("constructorMyService") MyService myService) {
        this.myService = myService;
    }
    public String getGreeting(){
        return myService.sayGreeting();
    }
}
