package ar.com.educacionit.decorator.cafeteria;

import ar.com.educacionit.decorator.cafeteria.interfaces.Bebida;

public class ConVainilla extends BebidaDecorador {

	public ConVainilla(Bebida bebida) {
		super(bebida); // Composición
	}

	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + " , con Vanilla";
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return bebida.getCosto() + 1.0;
	}

}
