package main.java;

import main.java.patterns.factory.*;

import java.util.Scanner;

public class FarmerJack {

    /*
     * it calls the main class for the project.
     * 
     */
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO FARMER JACK'S FARMS \n");
        
        

        init();
    }
    
    public static void init() {
        
        AnimalFarm.buildFarm build = new AnimalFarm.buildFarm();
        FishFarm.buildFarm build1 = new FishFarm.buildFarm();
        CropFarm.buildFarm build2 = new CropFarm.buildFarm();
        
        AnimalFarm farm = build.create();
        Currency.animalList.add(farm);
        FishFarm farm1 = build1.create();
        Currency.fishList.add(farm1);
        CropFarm farm2 = build2.create();
        Currency.cropList.add(farm2);
        new TimeCycle(3);
        
        System.out.println("Each farm starts with: "+ Currency.currency+ "Dollars\n");
        
        System.out.println("Creating a new farm: ");
    }

}
