package main.java;

import java.util.List;

import main.java.patterns.factory.Currency;
import main.java.patterns.factory.animals.AnimalFarm;
import main.java.patterns.factory.animals.Horses;
import main.java.patterns.factory.animals.Sheep;
import main.java.patterns.factory.crops.Apples;
import main.java.patterns.factory.crops.Coffee;
import main.java.patterns.factory.crops.CropFarm;
import main.java.patterns.factory.fish.FishFarm;
import main.java.patterns.factory.fish.Lobster;
import main.java.patterns.factory.fish.SwordFish;
import main.java.patterns.mediator.TimeCycle;

public class FarmerJack {

    /**
     * Method: Main method to run program simulations.
     * Description: This is the main method to run the program simulations.
     * It will run all design patterns simulation.
     * @param args
     * return
     */
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO FARMER JACK'S FARMS \n");
        
        System.out.println("Each farm starts with: " + Currency.getCurrency() + " Dollars\n");
        System.out.println("Creating a new farm: ");
        AnimalFarm.Buildfarm build = new AnimalFarm.Buildfarm();
        build.nameOne("Animal Farm").product(new Sheep());
        FishFarm.Buildfarm build1 = new FishFarm.Buildfarm();
        build1.nameOne("Fish Farm").product(new SwordFish());
        CropFarm.Buildfarm build2 = new CropFarm.Buildfarm();
        build2.nameOne("Crop Farm").product(new Coffee());
        List<AnimalFarm> animalList = Currency.getAnimalFarmList();
        List<FishFarm> fishList = Currency.getFishFarmList();
        
        List<CropFarm> cropList = Currency.getCropFarmList();
        
        AnimalFarm farm = build.create();
        farm.animalList.add(new Horses());
        animalList.add(farm);
        FishFarm farm1 = build1.create();
        farm1.fishList.add(new Lobster());
        fishList.add(farm1);
        CropFarm farm2 = build2.create();
        farm2.cropList.add(new Apples());
        cropList.add(farm2);
        new TimeCycle(3);        
        
    }

}
