package com.example.demo.task3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessor1 implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName)
            throws BeansException {
        if(bean instanceof LifeCycleBean){
            System.out.println("postProcessBeforeInitialization executed");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName)
            throws BeansException {
        if(bean instanceof LifeCycleBean){
            System.out.println("postProcessAfterInitialization executed");
        }
        return bean;
    }

}
