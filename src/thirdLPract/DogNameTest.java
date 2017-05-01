package thirdLPract;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogNameTest {
	Dog dog = new Dog();
	@Test
	public void testSameName() {
		assertTrue(dog.sameName(dog) == true);
	}

}
