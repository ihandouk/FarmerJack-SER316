package main.java;

import main.java.patterns.factory.*;
import java.util.Scanner;

public class FarmerJack {

    /*
     * it calls the main class for the project.
     * 
     */
    public static void main(String[] args) {
        
        Farm animalFarm = new AnimalFarm();
        Farm cropFarm = new CropFarm();
        Farm hybridFarm = new HybridFarm();
        
        farmProduct(animalFarm);
        farmProduct(cropFarm);
        farmProduct(hybridFarm);
    }
    
    public static void farmProduct(Farm aFarm) {
        
        aFarm.Animals();
        aFarm.Crops();
        aFarm.Farmers();
        aFarm.Predators();
    }

}
