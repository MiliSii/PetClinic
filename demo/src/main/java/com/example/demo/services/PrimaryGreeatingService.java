package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreeatingService implements MyService{

    //example for primary bean
// We provided another instance of the greeting service that implements the greeting service interface, annotated it as a Spring service so that brings that
    //up as a Spring component, and then we marked it as primary.
    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }

}
