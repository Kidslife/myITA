package forthLtask;

import java.util.Scanner;

public class HomeWirk3Main {
	public static void main(String[] args) {
		int[] hw3 = new int[5];
		int ctr = 0;
		System.out.println("Enter 5 integer numbers: ");

		while (ctr < hw3.length) {

			int ictr = new Scanner(System.in).nextInt();
			hw3[ctr] = ictr;
			ctr++;

		}
		System.out.print("Your array is [");
		for (int i : hw3) {
			System.out.print(" " + i + " ");
		}
		System.out.println("]");

		int occctr = 0;
		for (int i = 0; i < hw3.length; i++) {
			if (hw3[i] > 0) {
				occctr++;
				if (occctr == 2) {
					System.out.println("Second positive number is in " + (i + 1) + " position");

				}

			}
		}

		int min = hw3[0];
		int imin = 0;
		int i = 0;
		while (i < hw3.length) {
			if (hw3[i] < min) {
				min = hw3[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Mimimum = " + min);
		System.out.println(" is in " + (imin) + " place");

	}
}
