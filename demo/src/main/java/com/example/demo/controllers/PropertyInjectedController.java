package com.example.demo.controllers;

import com.example.demo.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//on the property injected controller, we have to tell Spring explicitly that we want Spring to go ahead and manage the injection of a service.

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    //this qualifier is just giving Spring a hint as to which bean you want to have injected.
    @Autowired
    public MyService myService;
//manually creating dependency injections
    //the least preferred method
    public String getGreeting(){
        return myService.sayGreeting();
        // create junit test
    }

    //So here we've created that greeting service interface. We have three Spring components that qualify for
    //this Dependency Injection because they all implement that interface. But Spring doesn't know which one
    //we want to be injected. We put in the qualifier hint so Spring now knows which one of these controllers gets which instance of the service.

}
