package com.singtel.code.test;

public class Parrot extends Bird {
	private Singer parrotNeighbour;
	
	public Parrot(Singer parrotNeighbour) {
		this.parrotNeighbour = parrotNeighbour;
	}
	
	public void sing() {
		this.parrotNeighbour.sing();
	}
}
