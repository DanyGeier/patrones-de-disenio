package ar.com.educacionit.decorator.notificador;

import ar.com.educacionit.decorator.notificador.interfaces.Notificador;

public class NotificadorTikTok extends NotificadorDecorador {

	public NotificadorTikTok(Notificador envoltura) {
		super(envoltura); // Composición
	}

	@Override
	public void enviar(String mensaje) {
		super.enviar(mensaje);
		System.out.println("Enviando por TikTok" + mensaje);
	}

	
}
