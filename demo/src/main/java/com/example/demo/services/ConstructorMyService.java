package com.example.demo.services;

import org.springframework.stereotype.Service;
//On the server itself, we added in the service annotation which tells Spring that this is a Spring managed component and to
//bring it into the Spring Context. Now we are never actually asking for that, for an instance of that in our main class.
@Service
public class ConstructorMyService implements MyService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
