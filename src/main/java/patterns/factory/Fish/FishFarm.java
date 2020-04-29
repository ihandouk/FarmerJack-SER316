package main.java.patterns.factory.fish;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import main.java.patterns.factory.Factory;

public class FishFarm extends Factory {
    
    public FishFarm() {
    }
    
    public static class Buildfarm {
        private Factory product;
        private int productQuantity = 3;
        private int farmerCount = 6;
        private int fishCount = 50;
           
        public Buildfarm() {
        }
        
        public FishFarm create() {
            return new FishFarm(this);
        }
           
        public Buildfarm product(Factory product) {
            this.product = product;
            return this;
        }
           
        public Buildfarm productQuantity(int quantity) {
            this.productQuantity = quantity;
            return this;
        }
        
        /**
         * Calling farmer count products at random.
         * @return
         */
        public Buildfarm farmerCount(int farmerCount) {
            this.farmerCount = farmerCount;
            return this;
        }
        
        /**
         * Calling fish count products at random.
         * @return
         */
        public Buildfarm fishCount(int fishCount) {
            this.fishCount = fishCount;
            return this;
        }   
    }
    
    private Factory product;
    private int productQuantity;
    private int fishCount;
    private int farmerCount;
    private int fishMin = 0;
    private int fishMax = 3;
    
    public List<Factory> fishList = new ArrayList<Factory>();
    private static Random rand = new Random();
    
    /**
     * Calling fish farm products at random.
     * @return
     */
    public FishFarm(Buildfarm build) {
        
        if (build.product == null) {        
            int num = ThreadLocalRandom.current().nextInt(fishMin, fishMax);
        
            switch (num) {
            
                case 0:
                    this.product = new Salmon();
                    break;
                case 1:
                    this.product = new SwordFish();
                    break;
                case 2:
                    this.product = new Lobster();
                    break;
                default:
                    this.product = new Lobster();
                    break;
            }
        } else {
            this.product = build.product;
        }
        fishList.add(this.product);
        
        this.productQuantity = build.productQuantity;
        this.farmerCount = build.farmerCount;
        this.fishCount = build.fishCount;
        
        System.out.println("This product name: " + getProdName());
        System.out.println("The quanitiy of the product: " + getProdQuantity());
        System.out.println("Number of Farmers: " + getfarmerCount());
        System.out.println("Total fish produced: " + getFishCount() + "\n");
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
    
    public int getFishCount() {
        return fishCount;
    }
}
