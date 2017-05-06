package fiveLtask;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		ArrayList<AnimalTask1> animals = new ArrayList<>();
		AnimalCat cat1 = new AnimalCat();
		AnimalCat cat2 = new AnimalCat();
		AnimalDog dog1 = new AnimalDog();
		AnimalDog dog2 = new AnimalDog();
		
		
		animals.add(cat1);
		animals.add(cat2);
		animals.add(dog1);
		animals.add(dog2);

		for (AnimalTask1 an : animals) {
			System.out.println(an.voice());
			System.out.println(an.feed());
			
		}
	}

}
