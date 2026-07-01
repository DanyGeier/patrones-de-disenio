package ar.com.educacionit.template_method.bebidas;

public class Te extends Bebida {

	@Override
	protected void agregarIngredientesPrincipales() {
		System.out.println("Agregando el té en hebras");
		
	}

	@Override
	protected void agregarExtras() {
		System.out.println("Agregando la miel!");
		
	}

}
