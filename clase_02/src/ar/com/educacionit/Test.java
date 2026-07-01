package ar.com.educacionit;

import ar.com.educacionit.decorator.cafeteria.Cafe;
import ar.com.educacionit.decorator.cafeteria.ConChocolate;
import ar.com.educacionit.decorator.cafeteria.ConVainilla;
import ar.com.educacionit.decorator.cafeteria.interfaces.Bebida;
import ar.com.educacionit.decorator.notificador.NotificadorEmail;
import ar.com.educacionit.decorator.notificador.NotificadorTikTok;
import ar.com.educacionit.decorator.notificador.NotificadorWhatsApp;
import ar.com.educacionit.decorator.notificador.interfaces.Notificador;
import ar.com.educacionit.factory.granja.GranjaFactory;
import ar.com.educacionit.factory.granja.TipoAnimal;
import ar.com.educacionit.factory.granja.interfaces.Animal;
import ar.com.educacionit.pasarela.Efectivo;
import ar.com.educacionit.pasarela.Pago;
import ar.com.educacionit.pasarela.TarjetaCredito;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 02");

		Pago efe = new Efectivo();
		efe.procesarPago(202.35);
		System.out.println("-------------------------------------");
		Pago tc = new TarjetaCredito();
		tc.procesarPago(462.53);
		
		// Patrón Decorador
		// Sirve para agregar funcionalidades a un objeto sin modificar el objeto base
		// La idea es envolver un objeto con otro objeto que le suma (funcionalidades) comportamientos
		
		// Sin el patrón
		// Tengo un Cafe (Cafe)
		// Tengo un café con chocolate (CafeConChocolate)
		// Tengo un café con chocolate (CafeConLeche)
		// Tengo un café con chocolate (CafeConLecheAzucar)
		
		// Con el patrón (El objeto base y los decoradores "implementan" la interfaz)
		// Interfaz en común
		// Objeto base y los decoradores...
		
		System.out.println("-------------------------------------");
		
		Cafe c = new Cafe();
		System.out.println(c.getDescripcion());
		System.out.println(c.getCosto());
		
		// DECORACION
		Bebida cc = new ConChocolate(c); // Vistiendo al acfé, agregandole el chocolate
		
		System.out.println(cc.getDescripcion());
		System.out.println(cc.getCosto());
	
		System.out.println("-------------------------------------");
		
		Bebida cc2 = new ConChocolate(cc);
		System.out.println(cc2.getDescripcion());
		System.out.println(cc2.getCosto());
		
		Bebida cv = new ConVainilla(cc2);
		System.out.println(cv.getDescripcion());
		System.out.println(cv.getCosto());
		
		System.out.println("-------------------------------------");
		System.out.println("Notificadores");
		System.out.println("-------------------------------------");
		
		Notificador ne = new NotificadorEmail();
		
		ne.enviar("Bienvenido a nuestro newsletter");
		
		// Decorador
		
		Notificador nwa = new NotificadorWhatsApp(ne); // por email + whatsapp
		
		nwa.enviar("Bienvenido a nuestra comunidad!");
		
		Notificador net = new NotificadorTikTok(ne); // por email + tiktok
		
		net.enviar("Bienvenido a nuestro grupo de lectura");
		
		Notificador netwa = new NotificadorWhatsApp(net);
		
		netwa.enviar("Novedades del grupo de lectura");
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Factory Method
		// Es una forma ordenada de crear objetos sin acoplamiento que podria 
		// suceder en la creación de objetos a gran escala
		
		// if ( tipo === 'admin' ) {
		// 	user = new AdminUser();
		// } else if ( tipo === 'normal' ) {
		// 	user = new Normaluser();
		// } else if ( tipo === 'invitado') {
		//  user = new InvitadoUser();
		// }
		
		// PROBLEMA
		// El código depende de clases concretas
		// Cada nuevo tipo rompe el archivo existente
		// La lógica de negocio está mezclada con la lógica de creación
		
		// Cuando usar Factory Method
		// - Tenés varios objetos similares
		// - El tipo se decide entiempo de ejecución
		// - Sabes que el sistema va a crecer
		
		System.out.println("-------------------------------------");
		
		GranjaFactory factory = new GranjaFactory();
		
		Animal perro = factory.crearAnimal(TipoAnimal.PERRO);
		perro.emitirSonido();
		Animal gato = factory.crearAnimal(TipoAnimal.GATO);
		gato.emitirSonido();
		Animal vaca = factory.crearAnimal(TipoAnimal.VACA);
		vaca.emitirSonido();
		Animal oveja = factory.crearAnimal(TipoAnimal.OVEJA);
		oveja.emitirSonido();
	}

}
