package ar.com.educacionit.memento.punto_control;

import ar.com.educacionit.memento.punto_control.interfaces.Memento;

public class MementoConcreto implements Memento {

	private final String nivel;
	private final int vida;
	
	public MementoConcreto(String nivel, int vida) {
		this.nivel = nivel;
		this.vida = vida;
	}

	@Override
	public String getNivel() {
		return this.nivel;
	}

	@Override
	public int getVida() {
		return this.vida;
	}

}
