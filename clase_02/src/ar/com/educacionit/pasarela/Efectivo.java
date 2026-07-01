package ar.com.educacionit.pasarela;

public class Efectivo extends Pago {

	@Override
	protected void validarCliente() {
		System.out.println("Controlar si el comprador ya es cliente");
		System.out.println("Revisar los billetes y que no sean falsos");

	}

	@Override
	protected void realizarPago(double monto) {
		System.out.println("Recibir los billetes, controlarlos y contarlos...");
		//this.crearFactura(monto);
	}
	
	@Override
	protected void crearFactura(double monto) {
		System.out.println("No se hace la factura...");
	}

}
