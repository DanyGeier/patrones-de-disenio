package ar.com.educacionit.strategy.pago_ecommerce;

import ar.com.educacionit.strategy.pago_ecommerce.interfaces.PagoEstrategia;

// Estrategias concreta (Paypal)
public class PaypalEstrategia implements PagoEstrategia {

	private String email;

	public PaypalEstrategia(String email) {
		this.email = email;
	}

	@Override
	public void pagar(int monto) {
		System.out.println("Pagando $" + monto + " con Paypal: " + this.email);
		
	}

	
	
}
