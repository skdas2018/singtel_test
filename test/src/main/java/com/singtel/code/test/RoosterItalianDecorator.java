package com.singtel.code.test;

public class RoosterItalianDecorator extends Rooster {
	private Rooster rooster;
	
	public RoosterItalianDecorator(Rooster rooster) {
		this.rooster = rooster;
	}
	
	public void sing() {
		this.rooster.sing();
		System.out.println("chicchirichi");
	}
}
