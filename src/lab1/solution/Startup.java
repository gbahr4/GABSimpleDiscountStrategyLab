package lab1.solution;

import lab1.*;
import java.text.NumberFormat;

/**
 *
 * @author jlombardo
 */
public class Startup {
    
   
    public static void main(String[] args) {
        
        BaseballHat baseballHat = new BaseballHat();
        
        baseballHat.setPartName("Baseball Hat");
        baseballHat.setPartNumber("12345");
        baseballHat.setPrice(10.00);
        baseballHat.setDiscountStrategy(new SmallDiscountStrategy());
        baseballHat.performDiscount();
        
        
        System.out.println(baseballHat.getPartName());        
        System.out.println(baseballHat.getPartNumber());
        System.out.println(baseballHat.getPrice());
        System.out.println(baseballHat.getDiscountPrice());
        
        
    }

   
}
