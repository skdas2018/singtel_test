package com.singtel.code.test;

public class AnimalCount {
	
	public static void main(String[] args) {
		AnimalBase[] animalArr = new AnimalBase[] {
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(new Rooster()),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(new Fish()),
				new Butterfly()
		};
		
		System.out.println("Count animal who can fly:"+countFly(animalArr));
		System.out.println("Count animal who can walk:"+countWalk(animalArr));
		System.out.println("Count animal who can sing:"+countSinger(animalArr));
		System.out.println("Count animal who can swim:"+countSwim(animalArr));

	}
	
	public static int countFly(AnimalBase[] animalArr) {
		int count = 0;
		for (AnimalBase animal : animalArr) {
			if (animal instanceof Flyer)
				count++;
		}
		
		return count;
	}
	
	public static int countWalk(AnimalBase[] animalArr) {
		int count = 0;
		for (AnimalBase animal : animalArr) {
			if (animal instanceof Walker)
				count++;
		}
		
		return count;
	}
	
	public static int countSinger(AnimalBase[] animalArr) {
		int count = 0;
		for (AnimalBase animal : animalArr) {
			if (animal instanceof Singer)
				count++;
		}
		
		return count;
	}
	
	public static int countSwim(AnimalBase[] animalArr) {
		int count = 0;
		for (AnimalBase animal : animalArr) {
			if (animal instanceof Swimmer)
				count++;
		}
		
		return count;
	}

}
