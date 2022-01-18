package com.example.demo;

import com.example.demo.task3.LifeCycleBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Task3Tests {

    @Autowired
    private LifeCycleBean lifeCycleBean;


    @Test
    public void testMyMessage(){
        String message = "Hello World!";
        lifeCycleBean.setMessage(message);

        Assertions.assertEquals(message,lifeCycleBean.getMessage());
        System.out.println("The message is : " + lifeCycleBean.getMessage());
    }

}
