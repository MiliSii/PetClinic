package com.example.demo;

import com.example.demo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		//in course is written ApplicationContext (it's not working) instead of ConfigurableApplicationContext

		//for i18n

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());



		MyController myController = (MyController) ctx.getBean("myController"); //spring is providing object

        //this is for MyController before it was refactored to work with Primary Bean
		/*String greeting = myController.sayHello();
        //asking context for the controller, greeting the return value of the method sayHello and the greeting
		System.out.println(greeting);
		// Hello World!!! and Hi Folks! are displayed as results*/

		System.out.println("------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------ Property"); //annotate Service in MyServiceImpl to work
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");// @Controller  annotation on SetterInjectedController and add @Autowired for setMyService
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	    //So  main class. But we added in to where we're calling on the context to give us a bean
		//of property injected controller, the setter injected controller and the constructor injected controller.

		//And then when we run our application now we have effectively four different Spring beans being brought
		//into the context, so we have the greeting(MyService) service itself that implantation. Spring is instantiating that.

		//And then it's also scanning and seeing that we have the three four different controls.
		// it sees that our property injected controller
		//Setter injected controlling, constructor injected controller, all have a dependency on the greeting service.
		//And when it constructs those beans, it automatically wires those up with that greeting service.
		// here we have one implementation of MyService


		//when multiple services have implementation of MyService we use @Qualifier
		//by using @Qualifier - getting the expected results. So property is getting the property greeting service. Setter is getting the setter greeting service and constructor is getting the constructor greeting service.

	}

}
