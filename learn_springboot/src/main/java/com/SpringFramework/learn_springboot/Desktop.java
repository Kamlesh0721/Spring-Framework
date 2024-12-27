package com.SpringFramework.learn_springboot;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
	public void compile() {
		System.out.println("Compiling Code in Desktop");
		System.out.println("Compiled");
	}
}