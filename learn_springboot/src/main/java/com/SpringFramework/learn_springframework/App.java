package com.SpringFramework.learn_springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Dev dev=(Dev)context.getBean("dev");
		System.out.println("Name : "+dev.getName());
		System.out.println("Age : "+dev.getAge());
		dev.build();
	}
}