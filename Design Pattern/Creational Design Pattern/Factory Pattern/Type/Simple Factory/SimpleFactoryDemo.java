public class SimpleFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Simple Factory Pattern ===\n");
        
        // Create different payment types using factory
        Payment creditCard = PaymentFactory.createPayment(
            "creditcard", 
            "1234567890123456|123"
        );
        
        Payment paytm = PaymentFactory.createPayment(
            PaymentType.PAYTM, 
            "9876543210"
        );
        
        Payment cbdc = PaymentFactory.createPayment(
            PaymentType.CBDC.name(), 
            "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"
        );
        
        // Using enum
        Payment creditCard2 = PaymentFactory.createPayment(
            PaymentType.CreditCard,
            "9876543210987654|456"
        );
        
        // Process payments
        if (creditCard.validatePaymentDetails()) {
            creditCard.processPayment(100.00);
        }
        
        if (paytm.validatePaymentDetails()) {
            paytm.processPayment(250.50);
        }
        
        if (cbdc.validatePaymentDetails()) {
            cbdc.processPayment(500.00);
        }
        
        System.out.println("\n=== Testing Invalid Input ===");
        try {
            Payment invalid = PaymentFactory.createPayment("unknown", "data");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}