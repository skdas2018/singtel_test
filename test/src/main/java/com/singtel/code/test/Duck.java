package com.singtel.code.test;

public class Duck extends Bird implements Swimmer {
	public void sing() {
		System.out.println("Quack, quack");
	}

	public void swim() {
		System.out.println("I am swimming");
	}
}
