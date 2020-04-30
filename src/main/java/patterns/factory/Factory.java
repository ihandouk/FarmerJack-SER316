package main.java.patterns.factory;

public abstract class Factory {

    protected String name;
    static String nameOne;
    private int readyCycle = 2;
    protected String salesName;
    protected double salesPrice;
    protected double price;
    
    public boolean isProduce = false;
    public int produceCount = 0;
    
    public int getReadyCycle() {
        return readyCycle;
    }
    
    public int getCycle() {
        return cycle;
    }
    
    public int getOldAge() {
        return animalEndCycle;
    }
    
    public String getName() {
        return name;
        
    }
    
    public String getName1() {
        return nameOne;
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
        
        if (this.produceCount > animalStartCycle) {
            this.isProduce = true;
            System.out.println(this.name + " is ready to support the farm production process.");
        }
        
        this.produceCount++;
        System.out.println(this.name + " is growing, and it might be ready for harvest soon.");
        
        if (this.produceCount > animalStartCycle) {
            this.isProduce = true;
            System.out.println(this.name + " is ready for harvesting, let's make some MONEY!!");
        }
    }
    
}
