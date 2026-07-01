package ar.com.educacionit.singleton;

public class AppConfig {
	
	// Instancia única
	private static AppConfig instance;
	
	// Punto de acceso global
	public static AppConfig getInstance() {
		if ( instance == null) {
			instance = new AppConfig();
		}
		return instance;
	}
	
	
	
}
