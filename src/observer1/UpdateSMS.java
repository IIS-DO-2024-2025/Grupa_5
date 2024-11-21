package observer1;

public class UpdateSMS implements Observer {
	public double bitcoinPrice;
	public double etherPrice;

	@Override
	public void update(double bitcoinPrice, double etherPrice) {
		this.bitcoinPrice = bitcoinPrice;
		this.etherPrice = etherPrice;
		sendSMS();
	}
	
	public void sendSMS() {
		System.out.println("New price of bitcoin is: " + bitcoinPrice);
		System.out.println("New price of ether is: " + etherPrice);
	}

}
