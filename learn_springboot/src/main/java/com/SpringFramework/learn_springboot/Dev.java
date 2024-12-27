package com.SpringFramework.learn_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	@Autowired
//	@Qualifier("desktop")
	Computer comp;

	public void build() {
		comp.compile();
		System.out.println("Coding in Spring Boot!");
	}
}