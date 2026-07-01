package ar.com.educacionit.command.editor_texto;

import ar.com.educacionit.command.editor_texto.interfaces.Command;

public class EscribirComando implements Command {
	
	private EditorTexto editor;
	private String palabra;
	
	public EscribirComando(EditorTexto editor, String palabra) {
		this.editor = editor;
		this.palabra = palabra;
	}

	@Override
	public void ejecutar() {
		editor.escribir(this.palabra);

	}

	@Override
	public void volverAtras() {
		this.editor.borrar(this.palabra.length());

	}

}
