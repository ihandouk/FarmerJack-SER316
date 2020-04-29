package main.java.patterns.factory;

import java.util.ArrayList;
import java.util.List;

import main.java.patterns.factory.Animals.AnimalFarm;
import main.java.patterns.factory.Crops.CropFarm;
import main.java.patterns.factory.Fish.FishFarm;

public class Currency {
    
    public static int currency = 300;
    public static List<AnimalFarm> animalList = new ArrayList<AnimalFarm>();
    public static List<FishFarm> fishList = new ArrayList<FishFarm>();
    public static List<CropFarm> cropList = new ArrayList<CropFarm>();

}