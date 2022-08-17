package com.example.demo.controllers;

import com.example.demo.services.MyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();//instantiating the controller object
        controller.setMyService(new MyServiceImpl());  //using the setter to inject that greeting service implementation.

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}