package main.java.patterns.factory;

import java.util.ArrayList;

public abstract class Farm {
    
   public static class buildFarm{
       
       private Factory factproduct;
       private int factproductSize = 3;
       private int farmerCount = 6;
       
       public buildFarm() {
           
       }
       
       public Farm create() {
           return new Farm(this);
       }
       
       public buildFarm prod(Factory factproduct) {
           this.factproduct = factproduct;
           return this;
       }
       
       public buildFarm prodSize(int factproductSize) {
           this.factproductSize = factproductSize;
           return this;
       }
       public buildFarm farmerCount (int farmerCount) {
           this.farmerCount = farmerCount;
           return this;
       }
       
   }
   
   

}
