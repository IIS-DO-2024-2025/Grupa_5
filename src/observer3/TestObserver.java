package observer3;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice(); 
		
		UpdateSMS updateSMS = new UpdateSMS();
		price.addListener(updateSMS);
		
		price.setBitcoinPrice(77000);
		price.setEtherPrice(31000);

	}

}
