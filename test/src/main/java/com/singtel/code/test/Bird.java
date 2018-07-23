package com.singtel.code.test;

public class Bird extends Animal implements Flyer, Singer {

	public void sing() {
		System.out.println("I am singing");
	}

	public void fly() {
		System.out.println("I am flying");
	}
}
