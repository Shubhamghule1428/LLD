package OCP.goodCode;

//Usage
public class ShoppingCart {
 public static void main(String[] args) {
     DiscountCalculator calculator = new DiscountCalculator();
     
     double amount = 1000;
     double discount = calculator.calculateDiscount(new VIPCustomerDiscount(), amount);
     System.out.println("Discount: " + discount);
 }
}