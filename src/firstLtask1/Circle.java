package firstLtask1;

import java.util.Scanner;

public class Circle {

		public static void main(String[] args) {
			System.out.println("Enter the radius: ");
			double s = new Scanner (System.in).nextDouble();
			SomeCircle yourCircle = new SomeCircle();
			yourCircle.radius = s;
			yourCircle.L = 2 * Math.PI * yourCircle.radius;
			yourCircle.S = Math.PI * Math.pow(yourCircle.radius, 2);
			System.out.println(yourCircle.toString());

		

	}

}
