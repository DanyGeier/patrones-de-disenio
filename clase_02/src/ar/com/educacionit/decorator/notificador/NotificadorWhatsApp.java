package ar.com.educacionit.decorator.notificador;

import ar.com.educacionit.decorator.notificador.interfaces.Notificador;

public class NotificadorWhatsApp extends NotificadorDecorador {

	public NotificadorWhatsApp(Notificador envoltura) {
		super(envoltura);
	}

	@Override
	public void enviar(String mensaje) {
		super.enviar(mensaje);
		System.out.println("Enviando por WhatsApp" + mensaje);
	}
	
}
