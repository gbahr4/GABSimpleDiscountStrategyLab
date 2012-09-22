package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class LeatherBelt extends Product {
    
    private DiscountStrategy discountStrategy;

    public LeatherBelt() {
        discountStrategy = new MediumDiscountStrategy();
    }

     


}
