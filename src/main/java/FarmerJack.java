package main.java;

import main.java.patterns.mediator.TimeCycle;

import main.java.patterns.factory.Animals.AnimalFarm;
import main.java.patterns.factory.Crops.CropFarm;
import main.java.patterns.factory.Currency;
import main.java.patterns.factory.Fish.FishFarm;

public class FarmerJack {

    /*
     * Method: Main method to run program simulations.
     * Inputs: args[] : String.
     * it calls the main class for the project.
     * @param
     * @return
     */
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO FARMER JACK'S FARMS \n");
        
        System.out.println("Each farm starts with: " + Currency.currency + " Dollars\n");
        System.out.println("Creating a new farm: ");
        AnimalFarm.buildFarm build = new AnimalFarm.buildFarm();
        FishFarm.buildFarm build1 = new FishFarm.buildFarm();
        CropFarm.buildFarm build2=new CropFarm.buildFarm();
        AnimalFarm farm = build.create();
        Currency.animalList.add(farm);
        AnimalFarm farm1 = build.create();
        Currency.animalList.add(farm1);
        AnimalFarm farm2 = build.create();
        Currency.animalList.add(farm2);
        FishFarm farm3 = build1.create();
        Currency.fishList.add(farm3);
        FishFarm farm4 = build1.create();
        Currency.fishList.add(farm4);
        FishFarm farm5 = build1.create();
        Currency.fishList.add(farm5);
        CropFarm farm6 = build2.create();
        Currency.cropList.add(farm6);
        CropFarm farm7 = build2.create();
        Currency.cropList.add(farm7);
        CropFarm farm8 = build2.create();
        Currency.cropList.add(farm8);
        new TimeCycle(3);        
        
    }

}
