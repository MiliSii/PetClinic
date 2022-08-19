package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements MyService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }

}
