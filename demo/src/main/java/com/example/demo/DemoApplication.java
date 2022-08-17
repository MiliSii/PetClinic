package com.example.demo;

import com.example.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		//in course is written ApplicationContext (it's not working) instead of ConfigurableApplicationContext

		MyController myController = (MyController) ctx.getBean("myController"); //spring is providing object

		String greeting = myController.sayHello();
        //asking context for the controller, greeting the return value of the method sayHello and the greeting
		System.out.println(greeting);
		// Hello World!!! and Hi Folks! are displayed as results


	}

}
