package main.java.patterns.factory.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import main.java.patterns.factory.Factory;

public class AnimalFarm extends Factory {

    public AnimalFarm() {

    }
    
    public static class Buildfarm {
        
        private String nameOne = "Animal Farm";
        private Factory product;
        private int productQuantity = 2;
        private int farmerCount = 6;
        private int animalCount = 2;
        public int cycle = 0;
        private int readyCycle = 2;
        private int animalStartCycle = 3;

        
        public int getCycle() {
            return cycle;
        }
        
        public int getReadyCycle() {
            return readyCycle;
        }
        
        public int getAdultCycle() {
            return animalStartCycle;
        }
                
        public Buildfarm() {
        }
        
        public AnimalFarm create() {
            return new AnimalFarm(this);
        }
        
        public Buildfarm nameOne(String nameOne) {
            this.nameOne = nameOne;
            return this;
        }

        public Buildfarm product(Factory product) {
            this.product = product;
            return this;
        }

        public Buildfarm productQuantity(int productQuantity) {
            this.productQuantity = productQuantity;
            return this;
        }
        
        public Buildfarm farmerCount(int farmerCount) {
            this.farmerCount = farmerCount;
            return this;
        }
        
        public Buildfarm animalCount(int animalCount) {
            this.animalCount = animalCount;
            return this;
        }   
    }

    private String nameOne;
    private Factory product;
    private int productQuantity;
    private int farmerCount;
    private int animalCount;
    private int animalMin = 0;
    private int animalMax = 3;

    public List<Factory> animalList = new ArrayList<Factory>();
    

    /**
     * It helps init a random switch for Animals, Crops, and Fish.
     * @param build Animal Farm.
     */
    public AnimalFarm(Buildfarm build) {
        this.nameOne = build.nameOne;
        
        if (build.product == null) {
            int num = ThreadLocalRandom.current().nextInt(animalMin, animalMax);

            switch (num) {

                case 0:
                    this.product = new Horses();
                    break;
                case 1:
                    this.product = new Sheep();
                    break;
                case 2:
                    this.product = new Cows();
                    break;
                default:
                    this.product = new Cows();
                    break;
            }
        } else {
            this.product = build.product;
        }
        animalList.add(this.product);

        this.productQuantity = build.productQuantity;
        this.farmerCount = build.farmerCount;
        this.animalCount = build.animalCount;

        System.out.println("Farm name: " + nameOne);
        System.out.println("Animal type: " + getProdName());
        System.out.println("The quanitiy of the product: " + getProdQuantity());
        System.out.println("Number of Farmers: " + getfarmerCount());
        System.out.println("Total animal count: " + getAnimalCount() + "\n");
    }

    public String getName1() {
        return nameOne;
    }
    
    public String getProdName() {
        return product.getName();
    }
    
    public int getProdQuantity() {
        return productQuantity;
    }
    
    public int getfarmerCount() {
        return farmerCount;
    }
    
    public int getAnimalCount() {
        return animalCount;
    }
   
}
