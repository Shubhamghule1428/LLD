package OCP.goodCode;

//Can add new discount types without modifying existing code
public class SeasonalDiscount implements DiscountStrategy {
 @Override
 public double calculateDiscount(double amount) {
     return amount * 0.15;
 }
}

