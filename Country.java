package firstLtask3;

public enum Country {
ENGLAND (0.78, "GBP"),
USA (1.34, "USD"),
UKRAINE (25.23, "UAH");

double tariff;
String currency;
private Country (double tariff, String currency) {
	this.currency = currency;
	this.tariff = tariff;
}



}
