package lab1.solution;

import lab1.*;

/**
 *
 * @author Greg Bahr
 */
public class LeatherBelt extends Product {

    public LeatherBelt() {
    }
    
        
    public LeatherBelt(String partName, String partNumber, double price, 
            DiscountStrategy discountStrategy) { 
            
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(discountStrategy);
        
    }

     


}
