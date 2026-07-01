package ar.com.educacionit.pasarela;

public class TarjetaCredito extends Pago {

	@Override
	protected void validarCliente() {
		System.out.println("Pedir el DNI");
		System.out.println("Comprobar si el nombre y el apellido coincide con el nombre en el plástico");
	}

	@Override
	protected void realizarPago(double monto) {
		System.out.println("Generando el debito de la cuenta del cliente por un valor" + monto);

	}

	@Override
	protected void crearFactura(double monto) {
		System.out.println("Creando la factura por un montó de " + monto);

	}

}
