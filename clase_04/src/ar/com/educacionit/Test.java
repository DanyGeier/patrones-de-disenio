package ar.com.educacionit;

import java.io.IOException;
import java.util.List;

import ar.com.educacionit.lectura_escritura.NioFacade;
import ar.com.educacionit.memento.punto_control.GestorPartidas;
import ar.com.educacionit.memento.punto_control.Jugador;
import ar.com.educacionit.observer.youtube.CanalYoutube;
import ar.com.educacionit.observer.youtube.Usuario;
import ar.com.educacionit.strategy.pago_ecommerce.CarritoCompras;
import ar.com.educacionit.strategy.pago_ecommerce.MercadoPagoEstrategia;
import ar.com.educacionit.strategy.pago_ecommerce.PaypalEstrategia;
import ar.com.educacionit.strategy.pago_ecommerce.TarjetaCreditoEstrategia;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 04");

		// Patrón Facade (Fachada) -> Patrón de diseño estructural
		// Sirve para simplificar -> Te da una única interfaz simple 
		// para usar un sistema complejo que 
		// por detrás tiene muchas clases, metodos y dependencias
		
		NioFacade nf = new NioFacade("usuarios.txt");
		
		try {
			nf.crearArchivoSiNoExiste();
			
			/*nf.escribirLineas(List.of(
					"1,Daniel,activo",
					"2,Gustavo,activo",
					"3.Laura,activo",
					"4.Ana,novisible"
			));*/
			System.out.println("\n--- Usuarios activos ---");
			nf.leerLineasContenidas("activo");
			
			nf.copiarA("backups/usuarios_backup.txt");
			
			nf.borrar();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Patrón Observer (Patrón Comportamiento)
		// Una forma prolija, estructurada y ordenada de avisar cambios sin andar preguntando
		// todo el tiempo.
		// 1. Un objeto cambia
		// 2. otros objetos se enteran automaticamente.
		// 3- sin que el primero tenga que conocerlos uno por uno.
		// https://refactoring.guru/es/design-patterns/observer
		
		System.out.println("Patrón Observer");
		
		CanalYoutube canal = new CanalYoutube();
		
		Usuario u1 = new Usuario("Dani");
		Usuario u2 = new Usuario("Nico");
		Usuario u3 = new Usuario("Rodri");
		
		canal.suscribir(u1);
		canal.suscribir(u2);
		canal.suscribir(u3);
		
		canal.subirVideo("Patrón Observer explicado en 10 segundos");
		
		Usuario u4 = new Usuario("Luis");
		
		canal.suscribir(u4);
		
		canal.subirVideo("Patrón Strategy explicado en 10 segundos");
		
		// Patrón Memento
		// Sirve para guardar y restaurar el estado interno de un objeto sin violar la encapsulación
		// GestorPartidas (Caretaker) -> gestor de checkpoints (Cuidador)
		// Jugador (Originador)
		// Memento (interfaz) // Contrato del memento
		// MementoConcreto (Memento)
		// https://refactoring.guru/es/design-patterns/memento
		
		System.out.println("Patrón Memento");
		Jugador jugador = new Jugador("Nivel 1", 100);
		
		GestorPartidas gestor = new GestorPartidas();
		
		// Guardar progeso
		gestor.add(jugador.guardar()); // Nivel 1 -> 100 | 0
		
		jugador.setEstado("Nivel 2", 75);
		
		System.out.println("Avanzó: " + jugador);
		// Guardar progeso
		gestor.add(jugador.guardar()); // Nivel 2 -> 75 | 1
		
		jugador.setEstado("Nivel 3", 50);
		System.out.println("Avanzó: " + jugador);
		gestor.add(jugador.guardar()); // Nivel 3 -> 50 | 2
		
		// Restaurar al nivel 1
		jugador.restaurar(gestor.get(0));
		System.out.println("Restaurado a: " + jugador);
		
		System.out.println(gestor.getCheckpoints());
		
		jugador.restaurar(gestor.get(1));
		
		System.out.println("Restaurado a nivel 2: " + jugador);
		
		// Patrón Strategy (Patrón Comportamiento)
		// Nos permite tener varias formas de hacer lo mismo y poder cambiarlas sin tocar el código que las usa.
		// Tenés que pagar algo (PAGAR)
		// Tarjeta de crédito (Estrategias Tarjeta Crédito)
		// Efectivo (Estrategias Efectivo)
		// Transferencias (Estrategias Transferencia)
		// https://refactoring.guru/es/design-patterns/strategy
		
		System.out.println("Patrón Strategy");
		
		CarritoCompras carro = new CarritoCompras();
		
		carro.setMetodoPagoEstrategia(new TarjetaCreditoEstrategia("123-456-555"));
		carro.checkout(500);
		
		carro.setMetodoPagoEstrategia(new PaypalEstrategia("dan@gmail.com"));
		carro.checkout(333);
		
		carro.setMetodoPagoEstrategia(new MercadoPagoEstrategia("dannn@test.com"));
		carro.checkout(444444);
	}

}
