package com.example.demo;

import com.example.demo.task1.mybean.Bean1;
import com.example.demo.task1.mybean.Bean2;
import com.example.demo.task1.mybean.Bean3;
import com.example.demo.task1.mybean.MyBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootTest
class Task1Tests {

	@Autowired
	private MyBean myBean;

	@Test
	void contextLoads() {
	}

	@Test
	void appContextNotNull(){
		Assertions.assertNotNull(myBean);
	}

	@Test
	void appContext_getByName(@Autowired Bean1 bean1){
		ApplicationContext applicationContext = myBean.getApplicationContext();
		Assertions.assertEquals(bean1,applicationContext.getBean("bean1"));
	}

	@Test
	void appContext_getByType(@Autowired Bean2 bean2){
		ApplicationContext applicationContext = myBean.getApplicationContext();
		Assertions.assertEquals(bean2,applicationContext.getBean(Bean2.class));
	}

	@Test
	void appContext_getByNameAndType(@Autowired Bean3 bean3){
		ApplicationContext applicationContext = myBean.getApplicationContext();
		Assertions.assertEquals(bean3,applicationContext.getBean("bean3", Bean3.class));
	}



}
