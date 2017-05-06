package sixthLTask;

import java.util.ArrayList;
import java.util.List;

public class PracticalTask1 {

	public static void main(String[] args) {
		List <Integer> MyColletion = new ArrayList<Integer>();
		List <Integer> NewCollection = new ArrayList<Integer>();
		PT1TenIntList arr1 = new PT1TenIntList();
		MyColletion = arr1.randonArrListInt();
		System.out.println(arr1);
		for (Integer a : MyColletion) {
			System.out.println(a);
		}
		System.out.println("");
		NewCollection = arr1.amountOfIntBiggerThanFive();
		for (Integer a : NewCollection) {
			System.out.println(a);
		}

	}

}
