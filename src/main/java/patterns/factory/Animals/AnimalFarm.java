package main.java.patterns.factory.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import main.java.patterns.factory.Factory;

public class AnimalFarm extends Factory {

    public AnimalFarm() {

    }
    
    public static class Buildfarm {
        
        private Factory product;
        private int productQuantity = 2;
        private int farmerCount = 6;
        private int animalCount = 2;
                
        public Buildfarm() {
        }
        
        public AnimalFarm create() {
            return new AnimalFarm(this);
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

        System.out.println("This product name: " + getProdName());
        System.out.println("The quanitiy of the product: " + getProdQuantity());
        System.out.println("Number of Farmers: " + getfarmerCount());
        System.out.println("Total animal count: " + getAnimalCount() + "\n");
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
