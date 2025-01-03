package com.SpringFramework.learn_springframework;

public class Dev {
	String name;
	int age;
	Computer comp;

	public Dev(Computer comp) {
		super();
		this.comp = comp;
	}

	public Dev() {
	}

	public Dev(int age) {
		super();
		System.out.println("Parameterized Constructor");
		this.age = age;
	}

	public Dev(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Computer getComputer() {
		return comp;
	}

	public void setComputer(Computer comp) {
		this.comp = comp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void build() {
		comp.compile();
		System.out.println("Building Project");
	}

}
