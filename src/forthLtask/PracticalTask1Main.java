package forthLtask;

public class PracticalTask1Main {

	public static void main(String[] args) {

		int[] ten = { -4, 3, 53, -53, 1, 0, 54, 23, -74, -9 };

		int max = ten[0];
		int maxctr = 0;
		int ctr = 0;
		while (ctr < ten.length) {
			if (max < ten[ctr]) {
				max = ten[ctr];
				maxctr = ctr;
			}
			ctr++;
		}

		int sum = 0;
		int amount = 0;
		for (int i = 0; i < ten.length; i++) {
			if (ten[i] >= 0) {
				sum = sum + ten[i];
			} else {
				amount++;
			}
		}

		System.out.println(max);
		System.out.println(sum);
		System.out.println(amount);
	}

}
