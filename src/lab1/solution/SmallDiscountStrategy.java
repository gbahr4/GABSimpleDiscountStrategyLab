
package lab1.solution;

/**
 *
 * @author Greg
 */
public class SmallDiscountStrategy implements DiscountStrategy {
    
    private double price;
    private double discountPrice;
    private static final double SMALL_DISCOUNT_PRICE = .10;
    
    
    public void calculateDiscountPrice() {
       discountPrice = price * SMALL_DISCOUNT_PRICE;
      
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

           
    
    
}
