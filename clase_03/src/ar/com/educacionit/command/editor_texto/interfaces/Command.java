package ar.com.educacionit.command.editor_texto.interfaces;

// El contrato (la interfaz)
public interface Command {
	void ejecutar();
	void volverAtras(); // Ctrl + z
}
