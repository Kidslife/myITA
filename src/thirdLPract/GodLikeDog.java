package thirdLPract;

public class GodLikeDog {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Buddy", Breed.ALASKAN_MALAMUTE, 3);
		Dog dog2 = new Dog("Buddy", Breed.DALMATIAN, 7);
		Dog dog3 = new Dog("Snoop", Breed.AMERICAN_ESKIMO_DOG, 5);
		
		dog1.sameName(dog2);
		dog2.sameName(dog3);
		dog1.sameName(dog3);
		
		
		Dog oldestDog = dog1;
		if (oldestDog.compareTo(dog2) < 0) {
			oldestDog = dog2;
		} else if (oldestDog.compareTo(dog3) < 0){
			oldestDog = dog3;
		}
			System.out.println(oldestDog.toStringForAge());
		
	}

}
