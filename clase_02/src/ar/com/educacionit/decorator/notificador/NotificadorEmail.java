package ar.com.educacionit.decorator.notificador;

import ar.com.educacionit.decorator.notificador.interfaces.Notificador;
// Clase base (Componente Concreto)
public class NotificadorEmail implements Notificador{

	@Override
	public void enviar(String mensaje) {
		System.out.println("Enviando EMAIL: " + mensaje);
		
	}
	
}
