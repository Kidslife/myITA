package forthLtask;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2Main {
	public static void main(String[] args) {

		int[] hw2 = new int[10];
		int ctr = 0;
		System.out.println("Enter 10 integer numbers: ");

		while (ctr < hw2.length) {

			int ictr = new Scanner(System.in).nextInt();
			hw2[ctr] = ictr;
			ctr++;

		}
		System.out.print("Your array is [");
		for (int i : hw2) {
			System.out.print(" " + i + " ");
		}
		System.out.println("]");
		
		int sum = 0;
		int sum2 =0;
		int i = 0;
		int[] hw2sum = Arrays.copyOfRange(hw2, 0, 5);
		while (i < hw2sum.length) {
			if (hw2sum[i] >= 0) {
				for (int isum = 0; isum < hw2sum.length; isum++) {
					sum += hw2sum[isum];
					i++;

				}
				System.out.println("Sum of first five elements is: " + sum);
			} else if (hw2sum[i] < 0) {
				int[] hw2sum2 = Arrays.copyOfRange(hw2, 5, hw2.length);
				for (int isum2 = 0; isum2 < hw2sum2.length; isum2++) {
					sum2 += hw2sum2[isum2];
					i++;
				}
				System.out.println("Sum of last five elements is: " + sum2);
			}

		}

	}

}
