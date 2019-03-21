package com.example.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringHelloWorld {

	public static void main(String[] args) {
		//Greetings greetings = new Greetings();
		//System.out.println(greetings.getMessage());

		//STEP 1: 
		//Create IoC Container
		
		//First way
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

		//Second Way
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/beans-config.xml");
		
		//Third Way
		//BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans-config.xml"));
		
		//Fourth way
		//BeanFactory context = new XmlBeanFactory(new FileSystemResource("src/beans-config.xml"));
		
		//STEP 2: Access Greetings Bean
		Greetings greetings = (Greetings) context.getBean("greetings");

		//STEP 3: Print the message
		System.out.println(greetings.getMessage());

		Greetings greetings1 = (Greetings) context.getBean("greetings1");
		System.out.println(greetings1.getMessage());

		System.out.println(context.getBeanDefinitionCount());
		
		context.close();
		
	}

}