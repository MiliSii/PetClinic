package com.example.demo.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("this is LifeCycle constructor");
    }

    //implements the variety of interfaces that Spring Framework gives us to work with lifecycle events
    //InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware are class that already exist in spring boot
    //ever method that is @Override here is added by spring automatically
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My Bean Name is: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle Bean has been terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Pre-destroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }

    //So you can see right here the first thing that happens that's in the lifecycle bean constructor. We
    //
    //get the name the bean factory is set. The application context has been set and then the post construct
    //
    //has been called. A lifecycle bean has all of its properties set, and then you can see the output that
    //
    //we had before from the variety of beans that we've been working with throughout this and right towards
    //
    //the bottom there you can see two more pre destroy and termination messages.
}
