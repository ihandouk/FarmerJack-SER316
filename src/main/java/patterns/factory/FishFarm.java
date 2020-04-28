package main.java.patterns.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FishFarm extends Factory {
    
    public FishFarm() {
        setName("Fish Farm");
    }
    
    public static class buildFarm{
        private Factory product;
        private int productQuantity = 3;
        private int farmerCount = 6;
        private int animalCount = 2;
           
        public buildFarm() {
        }
        
        public FishFarm create() {
            return new FishFarm(this);
        }
           
        public buildFarm product(Factory product) {
            this.product = product;
            return this;
        }
           
        public buildFarm productQuantity(int quantity) {
            this.productQuantity = quantity;
            return this;
        }
        public buildFarm farmerCount (int farmerCount) {
            this.farmerCount = farmerCount;
            farmerCount++;
            return this;
           }
        public buildFarm animalCount (int animalCount) {
            this.animalCount = animalCount;
            animalCount++;
            return this;
        }   
    }
    
    private Factory product;
    private int productQuantity;
    private int farmerCount = 3;
    private int fishPools = 2;
    
    public List<Factory> farmList = new ArrayList<Factory>();
    
    public FishFarm (buildFarm build) {
        
        if(build.product == null) {        
            int num = ThreadLocalRandom.current().nextInt(farmerCount, fishPools);
        
            switch(num) {
            
                case 0:
                    this.product = new Salmon();
                    break;
                case 1:
                    this.product = new SwordFish();
                    break;
                case 2:
                    this.product = new Lobster();
                    break;
            }
        }else {
            this.product = build.product;
        }
        farmList.add(this.product);
        
        this.productQuantity = build.productQuantity;
        this.farmerCount = build.farmerCount;
        
        System.out.println("Product type: " + getProdName());
        System.out.println("Product Qty: " + getProdQuantity());
        System.out.println("Number of Farmers: " + getfarmerCount() + "\n");
    }
}
