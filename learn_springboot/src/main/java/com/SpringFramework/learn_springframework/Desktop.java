package com.SpringFramework.learn_springframework;

public class Desktop implements Computer {
	@Override
	public void compile() {
		System.out.println("compiling in Desktop");
		System.out.println("Compiled ");
	}
}