package ar.com.educacionit.factory.medios_pago;

import ar.com.educacionit.factory.medios_pago.interfaces.Payment;

public class CryptoPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Pagando $ " + amount + " con crypto");

	}

}
