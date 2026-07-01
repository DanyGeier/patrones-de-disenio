package ar.com.educacionit.observer.youtube;
// Publicador -> Sujeto -> Porque tiene el estado que cambia (Tiene la lista de observadores)

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.observer.interfaces.Suscriptor;

public class CanalYoutube {

	private List<Suscriptor> suscriptores = new ArrayList<>();
	
	public void suscribir(Suscriptor s) {
		suscriptores.add(s);
	}
	
	public void desuscribir(Suscriptor s) {
		suscriptores.remove(s);
	}
	
	public void subirVideo(String titulo) {
		System.out.println("Nuevo video subido: " + titulo);
		for (Suscriptor suscriptor : suscriptores) {
			suscriptor.notificar(titulo); // Notifica a los sujetos -> notifica a los usuarios
		}
	}
}
