package forthLtask;

import java.util.Scanner;

public class HomeWork1main {

	public static void main(String[] args) {
		
		int [] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("Enter month's number:");
		int mn = new Scanner (System.in).nextInt();
		System.out.println("The amount of days in this month is " + md [mn-1]);

	}

}
