package ar.com.educacionit.template_method.bebidas;

public class Cafe extends Bebida {

	@Override
	protected void agregarIngredientesPrincipales() {
		System.out.println("Agregar café de especialidad");
		
	}

	@Override
	protected void agregarExtras() {
		System.out.println("Agregar canela");
		System.out.println("Agregar la leche");
		
	}

}
