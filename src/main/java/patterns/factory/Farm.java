package main.java.patterns.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
       
       public buildFarm factproduct(Factory factproduct) {
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
