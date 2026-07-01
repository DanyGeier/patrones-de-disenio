package ar.com.educacionit.command.editor_texto;

// Receiver
public class EditorTexto {

	private StringBuilder texto = new StringBuilder();
	
	public void escribir(String palabra) {
		texto.append(palabra);
	}
	
	// 20
	// 4
	// delete (start, end)
	// delete(16, 20)
	public void borrar(int distancia) {
		texto.delete(texto.length() - distancia, texto.length());
	}
	
	public String getTexto() {
		return texto.toString();
	}
	
}
