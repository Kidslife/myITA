package sixthLTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PT1TenIntList {
	private int i;
	List <Integer> iList = new ArrayList <Integer>();

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public List<Integer> randonArrListInt() {
		for (int a = 0; a < 10; a++) {
		i = ThreadLocalRandom.current().nextInt(-20, 30);
		iList.add(i);
		
		}
		return iList;
	}
	
	public List<Integer> amountOfIntBiggerThanFive() {
		List <Integer> fiveInt = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 10; i++) {
			if (iList.get(i) > 5) {
				
				fiveInt.add(i);
			}
		}
		return fiveInt;
		
	}

}
