package ar.com.educacionit.command.editor_texto;

import java.util.Stack;

import ar.com.educacionit.command.editor_texto.interfaces.Command;

public class CommandManager  {

	private Stack<Command> history = new Stack<>();
	
	public void ejecutarComando(Command comando) {
		comando.ejecutar();
		history.push(comando);
	}
	
	public void deshacerUltimo() {
		if ( !history.isEmpty() ) {
			history.pop().volverAtras();
		}
	}
	
}
