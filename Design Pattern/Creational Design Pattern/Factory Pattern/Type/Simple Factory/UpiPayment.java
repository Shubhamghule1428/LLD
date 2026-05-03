public class UpiPayment implements Payment {
    private String upiId;
    
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment: Rs." + amount);
        System.out.println("UPI ID: " + upiId);
    }
    
    @Override
    public boolean validatePaymentDetails() {
        return upiId.contains("@");
    }
    
}
