package main.java.patterns.factory.Crops;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import main.java.patterns.factory.Factory;

public class CropFarm extends Factory {
    
    public CropFarm() {

    }
    public static class buildFarm{
        private Factory product;
        private int productQuantity = 3;
        private int farmerCount = 6;
        private int cropCount = 2;
           
        public buildFarm() {
        }
        
        public CropFarm create() {
            return new CropFarm(this);
        }
           
        public buildFarm product(Factory prod) {
            this.product = prod;
            return this;
        }
           
        public buildFarm productQuantity(int quantity) {
            this.productQuantity = quantity;
               return this;
        }
        public buildFarm farmerCount (int fCount) {
            this.farmerCount = fCount;
            return this;
           }
        public buildFarm cropCount (int cCount) {
            this.cropCount = cCount;
            return this;
        }   
    }
    
    private Factory product;
    private int productQuantity;
    private int farmerCount;
    private int cropCount;
    private int cropMin = 0;
    private int cropMax = 3;
    public List<Factory> cropList = new ArrayList<Factory>();
    
    public CropFarm (buildFarm build) {
        
        if(build.product == null) {
            int num = ThreadLocalRandom.current().nextInt(cropMin, cropMax);
        
            switch(num) {
            
                case 0:
                    this.product = new Apples();
                    break;
                case 1:
                    this.product = new Coffee();
                    break;
                case 2:
                    this.product = new Oranges();
                    break;
            }
        }else {
            this.product = build.product;
        }
        cropList.add(this.product);
           

        this.productQuantity = build.productQuantity;
        this.farmerCount = build.farmerCount;
        this.cropCount = build.cropCount;
        
        System.out.println("This product name: " + getProdName());
        System.out.println("The quanitiy of the product: " + getProdQuantity());
        System.out.println("Number of Farmers: " + getfarmerCount() );
        System.out.println("Total Crop count: " + getCropCount() + "\n");
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
    public int getCropCount() {
        return cropCount;
    }

}
