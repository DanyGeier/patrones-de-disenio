package ar.com.educacionit.decorator.cafeteria;

import ar.com.educacionit.decorator.cafeteria.interfaces.Bebida;

public class Cafe implements Bebida{

	@Override
	public String getDescripcion() {
		return "Café";
	}

	@Override
	public double getCosto() {
		return 6.0;
	}

}
