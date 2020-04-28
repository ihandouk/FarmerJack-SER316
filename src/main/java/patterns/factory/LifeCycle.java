package main.java.patterns.factory;

import java.util.Iterator;

public class LifeCycle {

    public void LIfeCycle() {
        
        Iterator<AnimalFarm> animalIterator = Currency.animalList.iterator();
        
        while (animalIterator.hasNext()) {
            
            AnimalFarm animal = (AnimalFarm) animalIterator.next();
            
            Iterator<Factory> factoryIterator = animal.farmList.iterator();
            
            while(factoryIterator.hasNext()) {
                
                Factory product = factoryIterator.next();
                
                if(product.isProduce) {
                    
                    Currency.currency += product.salesPrice;
                    System.out.println("Item sold: " + product.salesName +
                            "for the amount of $"+product.price);
                    System.out.println("The farm's vault has a total of $"+Currency.currency+".\n");
                }else {
                    product.Cycle();
                }
            }
        }
    }
}
