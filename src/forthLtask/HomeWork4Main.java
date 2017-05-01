package forthLtask;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork4Main {

	public static void main(String[] args) {
		ArrayList<Integer> forsum = new ArrayList();
		int sum = 0;
		System.out.println("Enter a nambers:");
		int consolInt = 0;
		while (consolInt >= 0) {
			if (consolInt >= 0) {
				consolInt = new Scanner(System.in).nextInt();
				forsum.add(consolInt);
			}
			if (consolInt < 0) {
				System.out.println("You entered negative number.");
				break;

			}

		}
		for (int i1 = 0; i1 < forsum.size(); i1++) {
			sum += forsum.get(i1);

		}
		System.out.println(sum);
	}

}
