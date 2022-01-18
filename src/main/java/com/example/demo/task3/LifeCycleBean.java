package com.example.demo.task3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleBean implements ApplicationContextAware, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory executed");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName executed");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext executed");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy executed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet executed");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct executed");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre destroy executed");
    }

    public void initMethod(){
        System.out.println("init method executed");
    }

    public void destroyMethod(){
        System.out.println("destroy method executed");
    }


}

