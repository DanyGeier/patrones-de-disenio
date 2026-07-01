package ar.com.educacionit.template_method.bebidas;

public abstract class Bebida {

	// Clase base
	public void preparar() {
		// Algoritmo o pasos a seguir
		llenarElRecipiente();
		hervirAgua();
		agregarIngredientesPrincipales();
		servirEnRecipiente();
		agregarExtras();
	}
	
	private void llenarElRecipiente() {
		System.out.println("Llenando el recipiente...");
	}
	
	private void hervirAgua() {
		System.out.println("Hirviendo el agua...");
	}
	
	private void servirEnRecipiente() {
		System.out.println("Sirviendo el agua");
	}
	
	protected abstract void agregarIngredientesPrincipales();
	protected abstract void agregarExtras();
}
