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
    
    public void Harvested() {
        this.isProduce = false;
        this.produceCount = 0;
    }
    
    int Cycle = 0;
    private int animalStartCycle = 3;
    private int animalEndCycle = 14;
    private String pred;
    
    public void Cycle() {
        
        this.Cycle++;
        
        if(this.Cycle == Cycle + 2) {
            
            System.out.println("The farms produce vaults were attached by: "+this.pred);
        }
        
        if(this.Cycle < animalStartCycle) {
            System.out.println(this.name + " is not old enough to produce");
            return;
        }
        
        
        if(this.Cycle >= animalEndCycle) {
            System.out.println(this.name + " has died of old age.");
            return;
        }
        
        this.produceCount++;
        System.out.println(this.name + "cycle.");
        
        if(this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.name + " is ready to support the farm production process.");
        }
        
        this.produceCount++;
        System.out.println(this.name +" is growing, and it might be ready for harvest soon.");
        
        if(this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.name + "is ready for harvesting, let's make some MONEY!!");
        }
    }
    
}
