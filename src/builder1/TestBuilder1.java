package builder1;

public class TestBuilder1 {

	public static void main(String[] args) {
		PizzaBuilder cappricciosaBuilder = new CapricciosaBuilder();
		PizzaChef chef = new PizzaChef(cappricciosaBuilder);
		
		chef.makePizza();
		
		System.out.println("Napravili smo: " + chef.getPizza());

	}

}
