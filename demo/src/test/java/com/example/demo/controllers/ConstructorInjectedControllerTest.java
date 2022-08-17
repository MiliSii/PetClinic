package com.example.demo.controllers;

import com.example.demo.services.MyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
//the most preferred method
    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new MyServiceImpl());
        // creating a new constructor injected in controller and also at the same time creating that greeting service.
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}