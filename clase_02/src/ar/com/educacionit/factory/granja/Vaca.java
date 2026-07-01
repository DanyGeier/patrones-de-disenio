package ar.com.educacionit.factory.granja;

import ar.com.educacionit.factory.granja.interfaces.Animal;

public class Vaca implements Animal {

	@Override
	public void emitirSonido() {
		System.out.println("Muuuuu Muuuuu");
	}

}
