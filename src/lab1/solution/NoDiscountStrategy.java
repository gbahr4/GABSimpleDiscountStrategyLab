/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author Greg
 */
public class NoDiscountStrategy implements DiscountStrategy {

    private static final double DEFAULT_DISCOUNT = 0;    
    
    
    public double getDiscountPrice(double price) {
       
       return price * DEFAULT_DISCOUNT;
       
    }
    
    
    
}
