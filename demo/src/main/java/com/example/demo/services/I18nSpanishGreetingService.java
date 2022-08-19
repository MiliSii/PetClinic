package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"}) //list of values can be used in profile. in this case ES will be default when app is run if we don't set which profile is used in application properties
@Service("i18nService")
public class I18nSpanishGreetingService implements MyService{

    @Override
    public String sayGreeting(){
        return "Hola Mundo - ES";
    }

}
