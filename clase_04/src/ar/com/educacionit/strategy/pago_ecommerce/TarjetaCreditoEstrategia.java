package ar.com.educacionit.strategy.pago_ecommerce;

import ar.com.educacionit.strategy.pago_ecommerce.interfaces.PagoEstrategia;

public class TarjetaCreditoEstrategia implements PagoEstrategia {

	private String numeroTarjeta;
	
	public TarjetaCreditoEstrategia(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	@Override
	public void pagar(int monto) {
		System.out.println("Pagando $ " + monto + " con tarjeta de crédito");
		
	}
	
}
