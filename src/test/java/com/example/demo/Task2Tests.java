package com.example.demo;

import com.example.demo.task1.mybean.Bean1;
import com.example.demo.task2.beans.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class Task2Tests {

    @Autowired
    private ApplicationContext applicationContext;

    private static final String NAME_1 = "Lucila Kalbermatter";
    private static final String NAME_2 = "Barbara Lopez";

    @Test
    void givenSingletonScope_whenSetName_thenEqualNames() {
        Person person1 = applicationContext.getBean("personSingleton", Person.class);
        Person person2 = applicationContext.getBean("personSingleton", Person.class);

        person1.setName(NAME_1);
        Assertions.assertEquals(NAME_1, person1.getName());
        Assertions.assertEquals(NAME_1, person2.getName());

        person2.setName(NAME_2);
        Assertions.assertEquals(NAME_2, person1.getName());
        Assertions.assertEquals(NAME_2, person2.getName());

    }

    @Test
    void givenPrototypeScope_whenSetName_thenDifferentNames() {

        Person person1 = applicationContext.getBean("personPrototype", Person.class);
        Person person2 = applicationContext.getBean("personPrototype", Person.class);

        person1.setName(NAME_1);
        Assertions.assertEquals(NAME_1, person1.getName());
        Assertions.assertEquals(null, person2.getName());

        person2.setName(NAME_2);
        Assertions.assertEquals(NAME_1, person1.getName());
        Assertions.assertEquals(NAME_2, person2.getName());

    }

}

