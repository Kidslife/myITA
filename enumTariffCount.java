package firstLtask3;

import java.util.Scanner;

public class enumTariffCount {
	Country cntry;
	
	public enumTariffCount (Country cntry) {
		this.cntry = cntry;
	}
	
	public void computingPayment () {
		switch (cntry) {
		case ENGLAND:
			System.out.println("Enter your call duration:");
			int eng = new Scanner (System.in).nextInt();
			PhoneCall engCall = new PhoneCall();
			engCall.durationPerHour = eng;
			double engPayment = engCall.durationPerHour * Country.ENGLAND.tariff;
			System.out.println("Payment for your calls in " + Country.ENGLAND.name() + " is " + engPayment + " " + Country.ENGLAND.currency);
			break;
			
		case USA:
			System.out.println("Enter your call duration:");
			int usa = new Scanner (System.in).nextInt();
			PhoneCall usaCall = new PhoneCall();
			usaCall.durationPerHour = usa;
			double usaPayment = usaCall.durationPerHour * Country.USA.tariff;
			System.out.println("Payment for your calls in " + Country.USA.name() + " is " + usaPayment + " " + Country.USA.currency);
			break;
			
		case UKRAINE:
			System.out.println("Enter your call duration:");
			int ukr = new Scanner (System.in).nextInt();
			PhoneCall ukrCall = new PhoneCall();
			ukrCall.durationPerHour = ukr;
			double ukrPayment = ukrCall.durationPerHour * Country.UKRAINE.tariff;
			System.out.println("Payment for your calls in " + Country.UKRAINE.name() + " is " + ukrPayment + " " + Country.UKRAINE.currency);
			break;
			
			
		}
	
	
	
	}
	

}
