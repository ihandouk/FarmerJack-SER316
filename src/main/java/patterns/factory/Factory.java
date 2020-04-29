package main.java.patterns.factory;

public abstract class Factory {

    protected String name;
    protected String salesName;
    protected double salesPrice;
    protected double price;
    
    public boolean isProduce = false;
    public int produceCount = 0;
    public int readyCycle = 3;
    
    
    
    public String getName() {
        return name;
        
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
    
    public int getProduceCount() {
        return produceCount;
    }
    
    public void harvested() {
        this.isProduce = false;
        this.produceCount = 0;
    }
    
    
    int cycle = 0;
    private int animalStartCycle = 3;
    private int animalEndCycle = 14;
    private String pred;
    
    /**
     * verifying animals, fish, and crops eligibility to produce.
     * return
     */
    public void cycle() {
        
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
        System.out.println(this.name + "cycle.");
        
        if (this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.name + " is ready to support the farm production process.");
        }
        
        this.produceCount++;
        System.out.println(this.name + " is growing, and it might be ready for harvest soon.");
        
        if (this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.name + "is ready for harvesting, let's make some MONEY!!");
        }
    }
    
}
