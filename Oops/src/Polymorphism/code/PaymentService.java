package Polymorphism.code;

public class PaymentService {
    public void executePayment(PaymentProcessor processor, double amount) {
        // Same method works with different implementations
        processor.processPayment(amount);
    }
    
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        
        // Polymorphic behavior
        service.executePayment(new CreditCardProcessor("789478947894"), 100.0);
        service.executePayment(new UpiProcessor("ssg@okBank"), 200.0);
    }
}
