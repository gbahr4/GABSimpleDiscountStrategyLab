package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 * @final version
 */
public class Socks extends Product {

   
    public Socks(String partName, String partNumber, double price, DiscountStrategy discountStrategy) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(discountStrategy);
    }
    
        
    

       
}
