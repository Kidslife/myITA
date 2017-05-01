package forthLtask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracticalTask2Main {

	public static void main(String[] args) {

		PracticalTask2Employee Employee1 = new PracticalTask2Employee("Victor", 1, 333.112);
		PracticalTask2Employee Employee2 = new PracticalTask2Employee("Oleg", 3, 733.112);
		PracticalTask2Employee Employee3 = new PracticalTask2Employee("Lobster", 2, 363.112);
		PracticalTask2Employee Employee4 = new PracticalTask2Employee("Krevetko", 2, 313.112);
		PracticalTask2Employee Employee5 = new PracticalTask2Employee("Lina", 1, 343.112);

		ArrayList<PracticalTask2Employee> Elist = new ArrayList();
		Elist.add(Employee1);
		Elist.add(Employee2);
		Elist.add(Employee3);
		Elist.add(Employee4);
		Elist.add(Employee5);
		
		for (PracticalTask2Employee lk : Elist) {
			lk.LandK();
		}

		System.out.println("Enter department number from 1 to 3: ");
		int dep = new Scanner(System.in).nextInt();
		for (PracticalTask2Employee e : Elist) {
			e.containsNumber(dep);
		}

		Collections.sort(Elist, PracticalTask2Employee.CompareSalary.s);
		System.out.println("Sorted order of Elist is: ");
		for (PracticalTask2Employee emp : Elist) {

			System.out.println(emp);
		}

	}

}
