package ar.com.educacionit.strategy.pago_ecommerce;

import ar.com.educacionit.strategy.pago_ecommerce.interfaces.PagoEstrategia;

public class MercadoPagoEstrategia implements PagoEstrategia {

	private String email;
	
	public MercadoPagoEstrategia(String email) {
		this.email = email;
	}

	@Override
	public void pagar(int monto) {
		System.out.println("Pagando con Mercado Pago $" + monto + " con el correo" + this.email);

	}

}
