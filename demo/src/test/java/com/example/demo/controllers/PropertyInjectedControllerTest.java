package com.example.demo.controllers;

import com.example.demo.services.ConstructorMyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller=new PropertyInjectedController();//creating a new property injected controller object, assigning it to the variable controller
        controller.myService= new ConstructorMyService();
        //setting that property directly by accessing that properties
        // directly with the new greeting service implementation.

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}