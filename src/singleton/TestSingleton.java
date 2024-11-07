package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//DatabaseConnection connection1 = new DatabaseConnection();
		//DatabaseConnection connection2 = new DatabaseConnection();
		
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
		DatabaseConnection connection2 = DatabaseConnection.getInstance();
		
		// Ispis paketa, naziva klase objekta i hash vrednosti
		System.out.println(connection1.toString());
		System.out.println(connection2);
		
		// Izdvajanje hash vrednosti objekta
		System.out.println(Integer.toHexString(connection1.hashCode()));
		
		
		
		// Testiranje lazy loading
		DatabaseConnectionLazy lazyConnection1 = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy lazyConnection2 = DatabaseConnectionLazy.getInstance();
		System.out.println(lazyConnection1);
		System.out.println(lazyConnection2);
	}

}
