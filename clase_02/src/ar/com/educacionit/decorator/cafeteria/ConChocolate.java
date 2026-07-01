package ar.com.educacionit.decorator.cafeteria;

import ar.com.educacionit.decorator.cafeteria.interfaces.Bebida;

public class ConChocolate extends BebidaDecorador {

	public ConChocolate(Bebida bebida) {
		super(bebida); // Composición
	}

	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + ", con chocolate";
	}

	@Override
	public double getCosto() {
		return bebida.getCosto() + 2.0;
	}

}
