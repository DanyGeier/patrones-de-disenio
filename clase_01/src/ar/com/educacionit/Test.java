package ar.com.educacionit;

import ar.com.educacionit.singleton.*;
import ar.com.educacionit.template_method.bebidas.Bebida;
import ar.com.educacionit.template_method.bebidas.Cafe;
import ar.com.educacionit.template_method.bebidas.Te;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 01");
		// Son soluciones probadas a problemas que suelen ocurrir bastante seguido.
		// Son estructuras mentales que te dicen como organizar clases y objetos.
		// Ventajas
		// * Sea mantenible
		// * Sea extendible
		// * No se rompa cada vez que cambio un requisito
		// ------ Banda de los 4 eran desarrolladores
		// JAVA que se pusieron de acuerdo y crearon los 23 patrones y los categorizaron en 3 tipos
		// ---------------------- * Patrones creacionales
		// * Singleton
		// * Factory Method
		// * Abstract Factory
		// * Builder
		// ---------------------- * Patrones estructurales
		// * Adapter
		// * Decorator
		// * Composite
		// * Facade
		// ---------------------- * Patrones de comportamiento
		// * Observer
		// * Strategy
		// * Command
		// * State

		// Patrón Singleton
		// Sirve para garantizar que exista una sola instancia de una clase en toda la aplicación.
		// Un único punto de acceso
		
		// Ejemplo
		// 1. Configuración global de la aplicación
		// 2. Logger
		// 3. Conexiones a base de datos
		// 4. Caché compartida
		
		// -------------------------- EJEMPLO 1
		
		AppConfig config = AppConfig.getInstance();
		System.out.println(config);
		
		config = AppConfig.getInstance();
		System.out.println(config);
		
		config = AppConfig.getInstance();
		System.out.println(config);
		
		// -------------------------- EJEMPLO 2
		
		Logger logger = Logger.getInstancia();
		logger.log("Este es el primer log de nuestro Logger");
		System.out.println(logger.hashCode());
		
		Logger logger2 = Logger.getInstancia();
		logger2.log("Otro log del segundo logger");
		System.out.println(logger2.hashCode());
		
		// Una sola instancia
		// Control total sobre la creación 
		// Acceso controlado y central
		// Constructor privado. (No voy a poder hacer un new)
		
		// Logger l = new Logger();
		
		// Template Method
		
		// Sirve para definir el esqueleto de un algoritmo en una clase base y delegar
		// algunos pasos a las subclases. Sin permitir que se altere el orden de los pasos.
		// Resumiendo todos hacen el proceso pero cada uno resuelve ciertos pasos de una manera
		
		// ¿Para qué podria servir?
		
		// Login
		// Pasarela de pagos
		
		Bebida cafe = new Cafe();
		cafe.preparar();
		System.out.println("--------------------------");
		Bebida te = new Te();
		te.preparar();
		
		
		
		
	}

}
