package main.java.patterns.factory.crops;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import main.java.patterns.factory.Factory;

public class CropFarm extends Factory {
    
    public CropFarm() {

    }
    
    public static class Buildfarm {
        private Factory product;
        private int productQuantity = 2;
        private int farmerCount = 6;
        private int cropCount = 2;
           
        public Buildfarm() {
        }
        
        public CropFarm create() {
            return new CropFarm(this);
        }
           
        public Buildfarm product(Factory prod) {
            this.product = prod;
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
        
        public Buildfarm cropCount(int cropCount) {
            this.cropCount = cropCount;
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
    
    /**
     * Calling crop farm products at random.
     * @return
     */
    public CropFarm(Buildfarm build) {
        
        if (build.product == null) {
            int num = ThreadLocalRandom.current().nextInt(cropMin, cropMax);
        
            switch (num) {
            
                case 0:
                    this.product = new Apples();
                    break;
                case 1:
                    this.product = new Coffee();
                    break;
                case 2:
                    this.product = new Oranges();
                    break;
                default:
                    this.product = new Apples();
                    break;
            }
        } else {
            this.product = build.product;
        }
        cropList.add(this.product);
           

        this.productQuantity = build.productQuantity;
        this.farmerCount = build.farmerCount;
        this.cropCount = build.cropCount;
        
        System.out.println("This product name: " + getProdName());
        System.out.println("The quanitiy of the product: " + getProdQuantity());
        System.out.println("Number of Farmers: " + getfarmerCount());
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
