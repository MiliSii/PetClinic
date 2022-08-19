package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements MyService{
    @Override
    public String sayGreeting(){
        return "Hello World - EN";
    }

//added in two services with that and with the service annotation I'm naming it in the
//
//i18 service and then one I set up a profile of EN and the other has profile of ES and then using
//
//Spring active profiles.
//
//That's how I'm controlling the Spring Context as to which one of these two beans gets loaded into
//
//the context that runtime.

}
