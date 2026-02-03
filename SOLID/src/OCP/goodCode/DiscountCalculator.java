package OCP.goodCode;

//Calculator is closed for modification, open for extension
public class DiscountCalculator {
 public double calculateDiscount(DiscountStrategy strategy, double amount) {
     return strategy.calculateDiscount(amount);
 }
}