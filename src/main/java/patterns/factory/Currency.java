package main.java.patterns.factory;

import java.util.ArrayList;
import java.util.List;

import main.java.patterns.factory.Animals.AnimalFarm;
import main.java.patterns.factory.Crops.CropFarm;
import main.java.patterns.factory.Fish.FishFarm;

public class Currency {
    
    public static int currency = 200;
    public static int readyUpgrade = 1200;
    public static List<AnimalFarm> animalList = new ArrayList<AnimalFarm>();
    public static List<FishFarm> fishList = new ArrayList<FishFarm>();
    public static List<CropFarm> cropList = new ArrayList<CropFarm>();
    
    public static List<AnimalFarm> getAnimalFarmList(){
        return animalList;
    }
    
    public static List<FishFarm> getFishFarmList(){
        return fishList;
    }
    
    public static List<CropFarm> getCropFarmList(){
        return cropList;
    }
    
    public static int getCurrency() {
        return currency;
    }
    
    public static int getreadyUpgrade() {
        return readyUpgrade;
    }
    
    public static void addCurrency(int newCurrency) {
        currency = newCurrency;
    }
    
    public static void setCurrency(int newCurrency) {
        currency = newCurrency;
    }
    
    public static void setreadyUpgrade(int Upgrade) {
        currency = Upgrade;
    }

}