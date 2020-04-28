package main.java.patterns.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalFarm extends Factory {

	public AnimalFarm() {
	    setName("Animal Farm");
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
	    public buildFarm farmerCount (int farmerCount) {
	        this.farmerCount = farmerCount;
	        return this;
	       }
	    public buildFarm animalCount (int animalCount) {
	        this.animalCount = animalCount;
	        return this;
	    }   
	}
	
	private Factory product;
	private int productQuantity;
	private int farmerCount;
	private int animalMin = 1;
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
	    
	    System.out.println("Product type: " + getProdName());
        System.out.println("Product Qty: " + getProdQuantity());
        System.out.println("Number of Farmers: " + getfarmerCount() + "\n");
	}
   
}
