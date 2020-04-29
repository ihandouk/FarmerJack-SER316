package main.java.patterns.factory.Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import main.java.patterns.factory.Factory;

public class AnimalFarm extends Factory {

	public AnimalFarm() {

	}
	
	public static class buildFarm{
	    private Factory product;
	    private int productQuantity = 3;
	    private int farmerCount = 6;
	    private int animalCount = 2;
	       
	    public buildFarm() {
	    }
	    
	    public AnimalFarm create() {
	        return new AnimalFarm(this);
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
	    public buildFarm animalCount (int aCount) {
	        this.animalCount = aCount;
	        return this;
	    }   
	}
	
	private Factory product;
	private int productQuantity;
	private int farmerCount;
	private int animalCount;
	private int animalMin = 0;
	private int animalMax = 3;
	
	public List<Factory> farmList = new ArrayList<Factory>();
	   
	public AnimalFarm (buildFarm build) {
	       
	    if(build.product == null) {
	       
	        int num = ThreadLocalRandom.current().nextInt(animalMin, animalMax);
	       
	        switch(num) {
	           
	            case 0:
	                this.product = new Horses();
	                break;
	            case 1:
	                this.product = new Sheep();
	                break;
	            case 2:
	                this.product = new Cows();
	                break;
	        }
	    }else {
	        this.product = build.product;
	    }
	    farmList.add(this.product);
	       
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
