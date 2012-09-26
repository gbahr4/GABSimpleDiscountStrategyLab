
package lab1.solution;

/**
 *
 * @author Greg
 * @final version
 */
public class SmallDiscountStrategy implements DiscountStrategy {
    
    private static final double SMALL_DISCOUNT_PRICE = .10;
    
    public SmallDiscountStrategy() {
    }

      
    public double getDiscountPrice(double price) {
       
       return price * SMALL_DISCOUNT_PRICE;
      
    }

    

           
    
    
}
