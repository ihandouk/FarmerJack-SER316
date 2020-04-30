package main.java.patterns.factory;

import java.util.ArrayList;
import java.util.List;

import main.java.patterns.factory.animals.AnimalFarm;
import main.java.patterns.factory.crops.CropFarm;
import main.java.patterns.factory.fish.FishFarm;

public class Currency {
    
    private static int currency = 200;
    private static int readyUpgrade = 1200;
    private static List<AnimalFarm> animalList = new ArrayList<AnimalFarm>();
    private static List<FishFarm> fishList = new ArrayList<FishFarm>();
    private static List<CropFarm> cropList = new ArrayList<CropFarm>();
    
    public static List<AnimalFarm> getAnimalFarmList() {
        return animalList;
    }
    
    public static List<FishFarm> getFishFarmList() {
        return fishList;
    }
    
    public static List<CropFarm> getCropFarmList() {
        return cropList;
    }
    
    public static int getCurrency() {
        return currency;
    }
    
    public static int getreadyUpgrade() {
        return readyUpgrade;
    }
    
    public static void addCurrency(double price) {
        currency += price;
    }
    
    public static void setCurrency(int newCurrency) {
        currency = newCurrency;
    }
    
    public static void setreadyUpgrade(int upgrade) {
        readyUpgrade = upgrade;
    }

}