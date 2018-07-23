package com.singtel.code.test;

public class Clownfish extends Fish implements Joker {
	
	public Clownfish() {
		this.setColor("orange");
		this.setSize("small");
	}
	
	public void joke() {
		System.out.println("I am joking");	
	}

}
