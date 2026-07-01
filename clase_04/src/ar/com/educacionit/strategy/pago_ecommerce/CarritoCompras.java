package ar.com.educacionit.strategy.pago_ecommerce;

import ar.com.educacionit.strategy.pago_ecommerce.interfaces.PagoEstrategia;

// Contexto que tiene la referencia de la estrategia

public class CarritoCompras {
	
	private PagoEstrategia estrategia;
	
	public void setMetodoPagoEstrategia(PagoEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void checkout(int monto) {
		estrategia.pagar(monto);
	}
	
}
