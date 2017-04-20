package firstLtask3;

import java.util.Scanner;

public class Calls {


	public static void main(String[] args) {

		enumTariffCount England = new enumTariffCount(Country.ENGLAND);
		England.computingPayment();
		enumTariffCount UnaitedStates = new enumTariffCount(Country.USA);
		UnaitedStates.computingPayment();
		enumTariffCount Ukraine = new enumTariffCount(Country.UKRAINE);
		Ukraine.computingPayment();
	}

}
