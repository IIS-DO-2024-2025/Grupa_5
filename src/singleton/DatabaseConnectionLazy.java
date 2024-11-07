package singleton;

public class DatabaseConnectionLazy {
	
	// lazy loading
	
	private static DatabaseConnectionLazy instance;
	
	private DatabaseConnectionLazy() {
		
	}
	
	/* implementacija neke konekecije na BP */

	public static DatabaseConnectionLazy getInstance() {
		
		// prvi if za eliminaciju velikog broja slucajeva i smanjenja opterecenja
		if(instance == null)
			// provera u slucaju paralelnog programiranja
			synchronized(DatabaseConnectionLazy.class) {
				if(instance == null)
					instance = new DatabaseConnectionLazy();
			}
		return instance;
	}
	

}
