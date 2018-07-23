package com.singtel.code.test;

public class Shark extends Fish implements Cannibal {
	public Shark() {
		this.setColor("grey");
		this.setSize("large");
	}

	public void eatOwnType() {
		System.out.println("I am eating fish");
	}
}
