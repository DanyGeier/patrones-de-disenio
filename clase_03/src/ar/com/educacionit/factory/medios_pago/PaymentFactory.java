package ar.com.educacionit.factory.medios_pago;

import ar.com.educacionit.factory.medios_pago.enums.MediosPago;
import ar.com.educacionit.factory.medios_pago.interfaces.Payment;

public class PaymentFactory {
	
	public Payment createPayment(MediosPago payment) {
		switch (payment) {
		case CARD: {
			return new CardPayment();
		}
		case CRYPTO: {
			return new CryptoPayment();
		}
		case PAYPAL: {
			return new PayPalPayment();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + payment);
		}
	}
}
