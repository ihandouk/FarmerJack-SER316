package main.java.patterns.factory;

import java.util.Iterator;

import main.java.patterns.factory.Animals.AnimalFarm;
import main.java.patterns.factory.Crops.CropFarm;
import main.java.patterns.factory.Fish.FishFarm;

public class LifeCycle {

    public LifeCycle() {
        
        Iterator<AnimalFarm> animalIterator = Currency.animalList.iterator();
        
        while (animalIterator.hasNext()) {
            
            AnimalFarm animal = (AnimalFarm) animalIterator.next();
            
            Iterator<Factory> factoryIterator = animal.farmList.iterator();
            
            while(factoryIterator.hasNext()) {
                
                Factory product = factoryIterator.next();
                
                if(product.isProduce) {
                    
                    Currency.currency += product.price;
                    System.out.println("Item sold: " + product.salesName +
                            " for the amount of $"+product.price);
                    System.out.println("The farm's vault has a total of $"+Currency.currency+".\n");
                    if(Currency.currency >= 1200){
                        System.out.println("Farm is ready for an upgrade.");
                    
                    }
                }else {
                    product.Cycle();
                }
            }
        }
        Iterator<FishFarm> fishIterator = Currency.fishList.iterator();
        while (fishIterator.hasNext()) {
            
            FishFarm fish = (FishFarm) fishIterator.next();
            
            Iterator<Factory> factoryIterator = fish.fishList.iterator();
            
            while(factoryIterator.hasNext()) {
                
                Factory product = factoryIterator.next();
                
                if(product.isProduce) {
                    
                    Currency.currency += product.price;
                    System.out.println("Item sold: " + product.salesName +
                            " for the amount of $"+product.price);
                    System.out.println("The farm's vault has a total of $"+Currency.currency+".\n");
                    if(Currency.currency >= 1200){
                        System.out.println("Farm is ready for an upgrade.");
                    
                    }
                }else {
                    product.Cycle();
                }
            }
        }
        Iterator<CropFarm> cropIterator = Currency.cropList.iterator();
        while (cropIterator.hasNext()) {
            
            CropFarm crop = (CropFarm) cropIterator.next();
            
            Iterator<Factory> factoryIterator = crop.cropList.iterator();
            
            while(factoryIterator.hasNext()) {
                
                Factory product = factoryIterator.next();
                
                if(product.isProduce) {
                    
                    Currency.currency += product.price;
                    System.out.println("Item sold: " + product.salesName +
                            " for the amount of $"+product.price);
                    System.out.println("The farm's vault has a total of $"+Currency.currency+".\n");
                    if(Currency.currency >= 1200){
                        System.out.println("Farm is ready for an upgrade.");
                    
                    }
                }else {
                    product.Cycle();
                }
            }
        }
        
    }
}
