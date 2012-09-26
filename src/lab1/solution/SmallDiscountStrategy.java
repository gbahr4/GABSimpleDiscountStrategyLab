
package lab1.solution;

/**
 *
 * @author Greg
 */
public class SmallDiscountStrategy implements DiscountStrategy {
    
    private static final double SMALL_DISCOUNT_PRICE = .10;
    private double price;

    public SmallDiscountStrategy() {
    }

      
    public double getDiscountPrice(double price) {
       this.price = price;
       return price * SMALL_DISCOUNT_PRICE;
      
    }

    

           
    
    
}
