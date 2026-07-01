package ar.com.educacionit.lectura_escritura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class NioFacade {
	
	// Atributo -> final -> rutaArchivo es una constante
	private final Path rutaArchivo;

	public NioFacade(String rutaArchivo) {
		this.rutaArchivo = Paths.get(rutaArchivo);
	}
	
	// Creamos el archivo si no existe
	public void crearArchivoSiNoExiste() throws IOException {
		if (Files.notExists(rutaArchivo)) {
			Files.createFile(rutaArchivo);
			System.out.println("Archivo creado: " + rutaArchivo.toAbsolutePath());
		}
	}
	
	// Escribir líneas en un archivo
	public void escribirLineas(List<String> lineas) throws IOException {
		Files.write(rutaArchivo, lineas, StandardOpenOption.APPEND);
		System.out.println("Lineas escritas en: " + rutaArchivo.getFileName());
	}
	
	// Leer líneas de una cadena (Stream)
	public void leerLineasContenidas(String palabraClave) throws IOException {
		try(Stream<String> lineas = Files.lines(rutaArchivo)){
			lineas.filter(linea -> linea.contains(palabraClave))
				.forEach(System.out::println);
		}
	}
	
	// Copiar archivo a destino
	public void copiarA(String destinoArchivo) throws IOException {
		Path destinoRuta = Paths.get(destinoArchivo);
		if (Files.notExists(destinoRuta.getParent())){
			Files.createDirectories(destinoRuta.getParent());
		}
		Files.copy(rutaArchivo, destinoRuta, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Archivo copiado a: " + destinoRuta.toAbsolutePath());
	}
	
	// Eliminar archivo
	public void borrar() throws IOException {
		Files.deleteIfExists(rutaArchivo);
		System.out.println("Archivo eliminado: " + rutaArchivo.toAbsolutePath());
	}
	
	
	

}
