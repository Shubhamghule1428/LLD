public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cvv;
    
    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment: Rs." + amount);
        System.out.println("Card: **** **** **** " + cardNumber.substring(12));
    }
    
    @Override
    public boolean validatePaymentDetails() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }
    
}
