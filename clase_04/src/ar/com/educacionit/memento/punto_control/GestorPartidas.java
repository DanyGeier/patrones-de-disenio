package ar.com.educacionit.memento.punto_control;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.memento.punto_control.interfaces.Memento;

public class GestorPartidas {
	
	private List<Memento> checkpoints = new ArrayList<>();
	
	public void add(Memento memento) {
		checkpoints.add(memento);
	}
	
	public Memento get(int index) {
		return checkpoints.get(index);
	}
	
	public String getCheckpoints() {
		return checkpoints.toString();
	}
}
