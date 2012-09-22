package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class Socks extends Product {
    private DiscountStrategy discountStrategy;
    
    public Socks() {
       discountStrategy = new NoDiscountStrategy();   
    }

       
}
