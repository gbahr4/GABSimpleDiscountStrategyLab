package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class BaseballHat extends Product {
    
    
    private double discountPrice;
    
    public BaseballHat() {
        
    }

    public BaseballHat(String partName, String partNumber, double price, 
            DiscountStrategy discountStrategy) { 
            
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(discountStrategy);
        
    }

   

    
    
    

}
