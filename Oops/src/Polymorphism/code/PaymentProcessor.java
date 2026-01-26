package Polymorphism.code;

public interface PaymentProcessor {
    
    Boolean processPayment(double amount);

    String getPaymentType();
}
