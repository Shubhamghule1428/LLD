public class PaymentFactory {
    
    public static Payment createPayment(String type, String details) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(details.split("\\|")[0], details.split("\\|")[1]);
            case "paytm":
                return new PaytmPayment(details);
            case "upi":
                return new UpiPayment(details);
            case "cbdc":
                return new CBDCPayment(details);
            default:
                throw new IllegalArgumentException("Invalid payment type: " + type);
        }
    }

    // Overloaded method for convenience
    public static Payment createPayment(PaymentType type, String details) {
        return createPayment(type.name(), details); 
    }
}
