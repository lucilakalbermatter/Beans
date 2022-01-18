package com.example.demo.task2.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Task2Config {

    @Bean
    @Scope("singleton")
    public Person personSingleton (){
        return new Person();
    }

    @Bean
    @Scope("prototype")
    public Person personPrototype (){
        return new Person();
    }
}
