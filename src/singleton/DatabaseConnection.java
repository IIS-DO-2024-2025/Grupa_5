package singleton;

public class DatabaseConnection {
	
	// nestrljivo učitavanje (eager loading)
	
	private static DatabaseConnection instance = new DatabaseConnection();

	private /*public*/ DatabaseConnection() {
		
	}

	/* implementacija neke konekecije na BP */
	
	public static DatabaseConnection getInstance() {
		return instance;
	}
	
}
