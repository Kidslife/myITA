package firstLtask2;

import java.util.Scanner;

public class MyNameIs {

	public static void main(String[] args) {
		aPerson person = new aPerson();
		System.out.println("What is your name?");
		String s = new Scanner(System.in).nextLine();
		person.name = s;
		System.out.println("Where are you live, " + person.name + "?");
		String s1 = new Scanner(System.in).nextLine();
		person.address = s1;
		System.out.println("How old are you, " + person.name + "?");
		int s2 = new Scanner(System.in).nextInt();
		person.age = s2;
		System.out.print(person.toString());
	}

}
