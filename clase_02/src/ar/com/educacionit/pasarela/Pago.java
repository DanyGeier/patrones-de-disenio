package ar.com.educacionit.pasarela;

public abstract class Pago {

	// Clase base
	public void procesarPago(double monto) {
	
		// Algoritmo --> Pasos
		// 1. Validar Cliente
		validarCliente();
		// 1.2. Loguearse en la aplicación
		// 1.2. Registrarse
		// 2. Relizar el pago
		realizarPago(monto);
		// 3. Verificar el pago
		confirmarTransaccion();
		crearFactura(monto);
		
	}
	
	protected abstract void validarCliente();
	protected abstract void realizarPago(double monto);
	protected abstract void crearFactura(double monto);
	
	private void confirmarTransaccion() {
		System.out.println("Transacción confirmada");
	}
	
	
}
