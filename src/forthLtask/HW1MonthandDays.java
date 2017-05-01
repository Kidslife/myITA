package forthLtask;

import java.util.Scanner;

public enum HW1MonthandDays {
	JANUARY(1, 31), FEBRUARY(2, 28), MARCH(3, 31), APRIL(4, 30), MAY(5, 31), JUNE(6, 30), JULY(7, 31), AUGUST(8,
			31), SEPTEMBER(9, 30), OCTOBER(10, 31), NOVEMBER(11, 30), DECEMBER(12, 31);

	private int number;
	private int daysIn;

	private HW1MonthandDays(int number, int daysIn) {
		this.number = number;
		this.daysIn = daysIn;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getDaysIn() {
		return daysIn;
	}

	public void setDaysIn(int daysIn) {
		this.daysIn = daysIn;
	}

	public String setNumberGetDays() {
		System.out.println("Enter month's number:");
		int i = new Scanner(System.in).nextInt();
		if (HW1MonthandDays.this.number == i){

			return "The amount of days in " + HW1MonthandDays.this + " is - " + HW1MonthandDays.this.daysIn;
		}
		return null;
	}
}
