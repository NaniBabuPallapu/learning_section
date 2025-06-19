package company.com.design_patterns.structural;

// Existing interface used in your system
interface PaymentProcessor {
    void pay(double amount);
}

// Third-party class with incompatible interface
class PayPalAPI {
    public void makePayment(double amountInUSD) {
        System.out.println("Payment of $" + amountInUSD + " made through PayPal.");
    }
}

// Adapter class to bridge between your interface and PayPalAPI
class PayPalAdapter implements PaymentProcessor {

    private final PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void pay(double amount) {
        payPalAPI.makePayment(amount);
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {

        PayPalAPI payPalAPI  = new PayPalAPI();
        PaymentProcessor paymentProcessor = new PayPalAdapter(payPalAPI);
        paymentProcessor.pay(200);
    }
}
