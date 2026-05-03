public class PaytmPayment implements Payment {
    private String mobileNumber;
    
    public PaytmPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paytm payment: Rs." + amount);
        System.out.println("Mobile Number: " + mobileNumber);
    }
    
    @Override
    public boolean validatePaymentDetails() {
        return mobileNumber.matches("\\d{10}");
    }
}