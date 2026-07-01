package ar.com.educacionit.factory.granja;

import ar.com.educacionit.factory.granja.interfaces.Animal;

public class GranjaFactory {

	public Animal crearAnimal(TipoAnimal tipoDeAnimal) {
		
		switch (tipoDeAnimal) {
		case VACA: {
			return new Vaca();
		}
		case PERRO: {
			return new Perro();
		}
		case GATO: {
			return new Gato();
		}
		case OVEJA: {
			return new Oveja();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoDeAnimal);
		}
		
	}
}
