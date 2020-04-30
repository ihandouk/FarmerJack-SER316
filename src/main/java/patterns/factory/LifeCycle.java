package main.java.patterns.factory;

import java.util.Iterator;

import main.java.patterns.factory.animals.AnimalFarm;
import main.java.patterns.factory.crops.CropFarm;
import main.java.patterns.factory.fish.FishFarm;

public class LifeCycle {

    /**
     * Iterator Design Pattern.
     * It calculates the total currency collected from the farms' production.
     * return
     */
    public LifeCycle() {
        
        Iterator<AnimalFarm> animalIterator = Currency.getAnimalFarmList().iterator();
        
        while (animalIterator.hasNext()) {
            
            AnimalFarm animal = (AnimalFarm) animalIterator.next();
            
            Iterator<Factory> factoryIterator = animal.animalList.iterator();
            
            while (factoryIterator.hasNext()) {
                
                Factory product = factoryIterator.next();
                
                if (product.isProduce) {
                    Currency.addCurrency(product.price);

                    System.out.println("Item sold: " + product.salesName 
                            + " for the amount of $" + product.price);
                    
                } else {
                    product.cycle();
                }
            }
        }
        Iterator<FishFarm> fishIterator = Currency.getFishFarmList().iterator();
        while (fishIterator.hasNext()) {
            
            FishFarm fish = (FishFarm) fishIterator.next();
            
            Iterator<Factory> factoryIterator = fish.fishList.iterator();
            
            while (factoryIterator.hasNext()) {
                
                Factory product = factoryIterator.next();
                
                if (product.isProduce) {
                    Currency.addCurrency(product.price);

                    System.out.println("Item sold: " + product.salesName 
                            + " for the amount of $" + product.price);
                    
                } else {
                    product.cycle();
                }
            }
        }
        Iterator<CropFarm> cropIterator = Currency.getCropFarmList().iterator();
        while (cropIterator.hasNext()) {
            
            CropFarm crop = (CropFarm) cropIterator.next();
            
            Iterator<Factory> factoryIterator = crop.cropList.iterator();
            
            while (factoryIterator.hasNext()) {
                
                Factory product = factoryIterator.next();
                
                if (product.isProduce) {
                    Currency.addCurrency(product.price);

                    System.out.println("Item sold: " + product.salesName 
                            + " for the amount of $" + product.price);
                    
                } else {
                    product.cycle();
                }
            }
        }
        System.out.println("The farm's vault has a total of $" 
                + Currency.getCurrency() + ".\n");
        
    }
}
