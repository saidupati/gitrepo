package october_11;

interface PaymentStrategy {
	void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println("Paid with Credit Card: $" + amount);
	}
}

class PayPalPayment implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println("Paid with PayPal: $" + amount);
	}
}

class StrategyDesignPattern {
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkout(int amount) {
		paymentStrategy.pay(amount);
	}

	public static void main(String[] args) {
		StrategyDesignPattern cart = new StrategyDesignPattern();
		cart.setPaymentStrategy(new CreditCardPayment());
		cart.checkout(100);

		cart.setPaymentStrategy(new PayPalPayment());
		cart.checkout(50);
	}
}
