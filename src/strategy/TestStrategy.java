package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 1000.0;
		
		System.out.println("Regularna cena je: " + amount + " RSD");
		
		System.out.println("Studentska cena je: " + studentCart.calculateTotal(amount) + " RSD");
		System.out.println("Penzionerska cena je: " + pensionersCart.calculateTotal(amount) + " RSD");

		// BuffredWriter and BuffredReader 
		// ObjectOutputStream and ObjectInputStream
	}

}
