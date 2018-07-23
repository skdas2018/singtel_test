package com.singtel.code.test;

public class Dolphin extends AnimalBase implements Swimmer {
	private Fish fish;
	
	public Dolphin(Fish fish) {
		this.fish = fish;
	}
	
	public void swim() {
		this.fish.swim();
	}
	
}
