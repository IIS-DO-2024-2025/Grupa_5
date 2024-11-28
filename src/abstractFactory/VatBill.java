package abstractFactory;

import simpleFactory.Bill;

public class VatBill implements Bill {

	@Override
	public void pay() {
		System.out.println("VAT has been paid.");

	}

}
