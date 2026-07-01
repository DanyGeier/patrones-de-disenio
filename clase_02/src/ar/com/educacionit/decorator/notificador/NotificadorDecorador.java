package ar.com.educacionit.decorator.notificador;

import ar.com.educacionit.decorator.notificador.interfaces.Notificador;

public abstract class NotificadorDecorador implements Notificador {

	protected Notificador envoltura; // Composición
	
	public NotificadorDecorador(Notificador envoltura) {
		this.envoltura = envoltura;
	}

	@Override
	public void enviar(String mensaje) {
		envoltura.enviar(mensaje);
	}

}
