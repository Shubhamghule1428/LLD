package Polymorphism.code;

public class CreditCardProcessor implements PaymentProcessor {

    private String creditCardNum;

    public CreditCardProcessor(String creditCardNum){
        this.creditCardNum = creditCardNum;
    }

    @Override
    public Boolean processPayment(double amount) {
         System.out.println("Processing payment with Credit Card of amount: "+amount);
        return true;
    }

    @Override
    public String getPaymentType() {
   
        return "Credit Card";
    }
}