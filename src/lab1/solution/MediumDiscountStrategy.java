
package lab1.solution;

/**
 *
 * @author Greg Bahr
 * @final version
 */
public class MediumDiscountStrategy implements DiscountStrategy {
    
    private static final double MEDIUM_DISCOUNT_PRICE = .10;
        
    public double getDiscountPrice(double price) {
       
       return price * MEDIUM_DISCOUNT_PRICE;
       
    }

   

     
    
    
}
