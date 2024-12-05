package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integralna kifla");
		
		builder.spread("urnebes").spread("majonez").meat("šunka").salad("zelena").spread("pavlaka");
		Sandwich sandwich = builder.build();
	
		System.out.println(sandwich);

	}

}
