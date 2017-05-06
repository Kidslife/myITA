package forthLtask;

public class Dog implements Comparable<Dog>{
private String name;
private Breed breed;
private int age;

public Dog(String name, Breed breed, int age) {
	this.name = name;
	this.breed = breed;
	this.age = age;
}



public Dog() {
	
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Breed getBreed() {
	return breed;
}
public void setBreed(Breed breed) {
	this.breed = breed;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public boolean sameName(Dog dog) {			// we compare if fields name in our objects are equal, and if
											// our object is instance of Dog class
		if (this == dog) {return true;}
		if (dog == null) {return false;}
		if (getClass() != dog.getClass()) {return false;}
		Dog dogy = (Dog) dog;
		
		if (name == null) {
			if (dogy.name != null) {return false;}
		} else { if (!name.equals(dogy.name)) {
			System.out.println("ther is no one!");
			return false;}}
		System.out.println("ther is one! He is " + dogy.toStringForSameName());
		return true;
		
}	


public String toStringForSameName() {

	return name + " " + breed + " " + age + " years old";
}



public String toStringForAge() {
	return "The oldest dog is " + age + " age old. His name is " + name + ", and his breed is " + breed + ".";
}

@Override
public int compareTo(Dog o) {				// find the oldest dog
	if (this.age > o.age) {
	return 1;} 
	else { 
		if (this.age < o.age) {
	return -1;
	} 
	} 
	return 0;
	
}



}
