
package lab1.solution;

/**
 *
 * @author Greg
 */
public class MediumDiscountStrategy implements DiscountStrategy {
    
    private double price;
    private double discountPrice;
    private static final double SMALL_DISCOUNT_PRICE = .10;
    
    
    public double calculateDiscountPrice() {
       discountPrice = price * SMALL_DISCOUNT_PRICE;
       return discountPrice;
    }

     
    
    
}
