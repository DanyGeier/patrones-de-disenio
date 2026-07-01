package ar.com.educacionit.decorator.cafeteria;

import ar.com.educacionit.decorator.cafeteria.interfaces.Bebida;
// Decorador es abstacto
// Cuando tengo una clase abstracta, no necesita respetar el contrato.
public abstract class BebidaDecorador implements Bebida {

	protected Bebida bebida; // Composición (Envolver un objeto dentro de otro)

	// Constructor
	public BebidaDecorador(Bebida bebida) {
		this.bebida = bebida;
	}
	
	
	

}
