package com.example.demo.controllers;

import com.example.demo.services.MyService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

   /* public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }*/

    //this part is refactored MyController to be used with primary Bean

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public String sayHello(){
        return myService.sayGreeting();
    }


    // in my controller  we've just added in the property for the greeting service. Added on the constructor.
    //No need for the @Autowired and also no need for the qualifier.
    //
    //So remember on the constructor injected controller we added in this qualifier.
    //
    //if we delete @Qualifier in ConstructorInjectedController we'll get the primary bean
    //injected into the constructor injected controller as well.
    //
    //So now you can see that now once again in the primary bean but I don't want to do that.

}
