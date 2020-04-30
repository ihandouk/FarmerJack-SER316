package main.java.patterns.factory;

import main.java.patterns.factory.animals.AnimalFarm;

public abstract class Factory {

    protected String name;
    protected String nameOne;
    protected String salesName;
    protected double salesPrice;
    private int readyCycle = 3;
    protected double price;
    public boolean isProduce = false;
    public int produceCount = 0;
    
    
    
    public String getName() {
        return name;
        
    }
    
    public String getName1() {
        return nameOne;
    }
    
    public String getPred() {
        pred = "Predator";
        return pred;
    }
    
    public String getSalesName() {
        return salesName;
    }
    
    public double getSalesPrice() {
        return salesPrice;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean isProduce() {
        return isProduce;
    }
    
    public int getAdultCycle() {
        return animalStartCycle;
    }
    
    public int getCycle() {
        return animalEndCycle;
    }  
    public int getProduceCount() {
        return produceCount;
    }
    
    public void harvested() {
        this.isProduce = false;
        this.produceCount = 0;
    }
    
    
    public static int cycle = 0;
    private int animalStartCycle = 3;
    private int animalEndCycle = 14;
    private String pred;
    
    /**
     * verifying animals, fish, and crops eligibility to produce.
     * return
     * @param farm1 
     */
    public void cycle(AnimalFarm farm1) {
        
        // incrementing cycles
        this.cycle++;
        // verifying animal eligibility
        if (this.cycle < animalStartCycle) {
            System.out.println(this.name + " is not old enough to produce");
            return;
        }
        
        // verifying animal eligibility
        if (this.cycle >= animalEndCycle) {
            System.out.println(this.name + " has died of old age.");
            return;
        }
        // Checking if it is able to support the production process.
        this.produceCount++;
        
        if (this.produceCount > animalStartCycle) {
            this.isProduce = true;
            System.out.println(this.name + " is ready to support the farm production process.");
        }
        
        this.produceCount++;
        System.out.println(this.name + " is growing, and it might be ready for harvest soon.");
        
        if (this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.name + " is ready for harvesting, let's make some MONEY!!");
        }
    }
    
}
