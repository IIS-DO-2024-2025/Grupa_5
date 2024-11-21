package observer2;

public class TestObserver2 {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();
		
		UpdateSMS updateSMS = new UpdateSMS();
		price.addObserver(updateSMS);
		
		price.setBitcoinPrice(24000);
		price.setEtherPrice(12000);

	}

}
