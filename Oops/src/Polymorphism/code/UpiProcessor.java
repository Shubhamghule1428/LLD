package Polymorphism.code;

public class UpiProcessor implements PaymentProcessor {

    private String VpaID;

    public UpiProcessor(String VpaID){
        this.VpaID = VpaID;
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