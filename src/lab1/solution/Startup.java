package lab1.solution;

import lab1.*;
import java.text.NumberFormat;

/**
 *
 * @author Greg Bahr
 * @final version
 */
public class Startup {
    
    private static double price;
   
    public static void main(String[] args) {
        
           Product[] products = {
            new BaseballHat("Brewers Baseball Hat", "BH100",19.95, 
                   new SmallDiscountStrategy()),
            new LeatherBelt("Men's Leather Dress Belt", "LB201", 39.50, 
                   new MediumDiscountStrategy()),
            new Socks("Women's Cotton Socks (Large)", "WS45", 25.88, 
                   new NoDiscountStrategy())
                  
        };
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        for(Product p : products) {
           
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscount()));
        }
    }
        
}    
    
