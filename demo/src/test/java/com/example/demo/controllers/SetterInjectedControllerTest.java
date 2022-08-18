package com.example.demo.controllers;

import com.example.demo.services.ConstructorMyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();//instantiating the controller object
        controller.setMyService(new ConstructorMyService());  //using the setter to inject that greeting service implementation.

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}