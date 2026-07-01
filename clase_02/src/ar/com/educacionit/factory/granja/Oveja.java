package ar.com.educacionit.factory.granja;

import ar.com.educacionit.factory.granja.interfaces.Animal;

public class Oveja implements Animal {

	@Override
	public void emitirSonido() {
		System.out.println("Meeeeeeehhhh Meeeeehhh");

	}

}
