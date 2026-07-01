package ar.com.educacionit.singleton;

public class Logger {

	// atributo de clase
	private static Logger instancia; // No es un atributo de instancia.Atributo de clase

	
	//
	private Logger() {}
	
	public static Logger getInstancia() { // getInstancia es un método de clase
		if ( instancia == null) {
			instancia = new Logger();
		}
		return instancia;
	}
	
	public void log(String mensaje) {
		System.out.println("[LOG]: " + mensaje);
	}
	
	
}
