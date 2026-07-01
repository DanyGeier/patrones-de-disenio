package ar.com.educacionit;

import ar.com.educacionit.builder.usuario.Usuario;
import ar.com.educacionit.command.editor_texto.CommandManager;
import ar.com.educacionit.command.editor_texto.EditorTexto;
import ar.com.educacionit.command.editor_texto.EscribirComando;
import ar.com.educacionit.command.editor_texto.interfaces.Command;
import ar.com.educacionit.factory.medios_pago.PaymentFactory;
import ar.com.educacionit.factory.medios_pago.enums.MediosPago;
import ar.com.educacionit.factory.medios_pago.interfaces.Payment;

public class Test {

	public static void main(String[] args) {
		
		PaymentFactory pf = new PaymentFactory();
		
		Payment cp = pf.createPayment(MediosPago.CARD);
		cp.pay(222.3);
		
		Payment crypto = pf.createPayment(MediosPago.CRYPTO);
		crypto.pay(333.2);
		
		Payment pp = pf.createPayment(MediosPago.PAYPAL);
		pp.pay(888.5);

		// -----------------------------------------------
		System.out.println("---------------------------");
		// -----------------------------------------------
		
		// Patrón command (Comportamiento)
		
		// El patrón command sirve para separar quién pide una acción de quíén ejecuta la acción
		// Osea nos obliga a no mezclar la lógica del botón/shorcut con la lógica de ejecución
		
		// Comando concreto -> EscribirComando
		// Receiver -> Recibe la tarea a realizar -> EditorTexto
		// Invoker -> Invoca -> CommandManager
		
		// Recibe (Receiver)
		
		EditorTexto editor = new EditorTexto();
		
		// Invoca (Invoker)
		
		CommandManager manager = new CommandManager();
		
		// Comandos concretos
		Command escribirHola = new EscribirComando(editor, "Hola ");
		Command escribirMundo = new EscribirComando(editor, "Mundo");
		
		manager.ejecutarComando(escribirHola);
		manager.ejecutarComando(escribirMundo);
		
		System.out.println("Texto actual: " + editor.getTexto()); // Hola Mundo
		
		manager.deshacerUltimo();
		
		System.out.println("Texto luego del borrado: " + editor.getTexto()); // Hola
		
		Command escribirChau = new EscribirComando(editor, "Chau");
		manager.ejecutarComando(escribirChau);
		
		System.out.println("Texto al final: " + editor.getTexto());
		
		// -----------------------------------------------
		System.out.println("---------------------------");
		// -----------------------------------------------
		
		// Patrón Builder (Creacional)
		// Lo que queremos evitar con este patrón son los constructores con múltiples parametros.
		// Construir un objeto paso a paso de forma legible, controlada para obtener un objeto completo.
		
		// Usuario usuario = new Usuario("Dani", "Geier", "15-1245-1249", 22, "dgeier@hotmail.com");
		
		Usuario u = new Usuario.Builder("Dani","Geier")
				.edad(22)
				.email("dgeier@gmail.com")
				.telefono("15-1245-1249")
				.build();
		
		System.out.println(u);
		
	}

}
