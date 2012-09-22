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
    private double price;
    private double discountPrice;

    
    
    public void calculateDiscountPrice() {
       discountPrice = price;
       
    }
    
    
    
}
