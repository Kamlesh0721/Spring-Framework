package com.SpringFramework.learn_springboot;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer {
	public void compile() {
		System.out.println("Compiling Code in Laptop");
		System.out.println("Compiled");
	}
}