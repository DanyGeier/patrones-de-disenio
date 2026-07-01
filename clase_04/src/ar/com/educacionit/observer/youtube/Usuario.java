package ar.com.educacionit.observer.youtube;

import ar.com.educacionit.observer.interfaces.Suscriptor;
// Suscriptor concreto -> Observador concreto, tiene que respetar el contrato Suscriptor
public class Usuario implements Suscriptor{

	private String nombre;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void notificar(String video) {
		System.out.println(this.nombre + " recibió la notificación");
		
	}

}
