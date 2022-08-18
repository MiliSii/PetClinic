package com.example.demo.controllers;

import com.example.demo.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//Remember on the property injected controller, we have to tell Spring explicitly that we want Spring to go ahead and manage the injection of a greeting service.
//Same with the setter injected. We have to tell Spring explicitly that we want the setter to be used for that dependency.

@Controller
public class SetterInjectedController {
    private MyService myService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public String getGreeting(){
        return myService.sayGreeting();
    }
}
