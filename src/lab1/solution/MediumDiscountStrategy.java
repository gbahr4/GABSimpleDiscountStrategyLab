
package lab1.solution;

/**
 *
 * @author Greg Bahr
 */
public class MediumDiscountStrategy implements DiscountStrategy {
    
    private static final double MEDIUM_DISCOUNT_PRICE = .10;
    private double price;
    
    public double getDiscountPrice(double price) {
       this.price = price;
       return price * MEDIUM_DISCOUNT_PRICE;
       
    }

   

     
    
    
}
