package com.example.demo.controllers;

import com.example.demo.services.MyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    //So i18N is a common abbreviation for internationalization. So internationalization begins with I, ends with N and 18 characters long.

    //added in  internationalization controller which takes
    //
    //a greeting service like everybody else does but when I have it having it take in a qualifier of a
    //
    //i18N service.
    private final MyService myService;


    public I18nController(@Qualifier("i18nService") MyService myService) {
        this.myService = myService;
    }

    public String sayHello(){
        return myService.sayGreeting();
    }

}
