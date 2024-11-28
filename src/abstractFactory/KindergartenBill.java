package abstractFactory;

import simpleFactory.Bill;

public class KindergartenBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Kindergarten has been paid.");
	}

}
