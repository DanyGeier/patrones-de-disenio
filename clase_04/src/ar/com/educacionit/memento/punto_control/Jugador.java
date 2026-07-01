package ar.com.educacionit.memento.punto_control;

import ar.com.educacionit.memento.punto_control.interfaces.Memento;

public class Jugador {
	
	private String nivel;
	private int vida;
	
	public Jugador(String nivel, int vida) {
		this.nivel = nivel;
		this.vida = vida;
	}
	
	public void setEstado(String nivel, int vida) {
		this.nivel = nivel;
		this.vida = vida;
	}
	
	public Memento guardar() {
		return new MementoConcreto(this.nivel, this.vida);
	}
	
	public void restaurar(Memento memento) {
		this.nivel = memento.getNivel();
		this.vida = memento.getVida();
	}
	
	@Override
	public String toString() {
		return "Jugador en " + nivel + " con vida: " + vida;
	}
}
