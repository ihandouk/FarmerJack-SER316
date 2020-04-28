package main.java.patterns.factory;

public abstract class Factory {

    protected String name;
    protected String prodName;
    protected String salesName;
    protected int prodQuantity;
    protected int farmerCount;
    protected double salesPrice;
    protected double price;
    
    public boolean isProduce = false;
    public int produceCount = 0;
    public int readyCycle = 3;
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public String getSales() {
        return salesName;
    }
    
    public String getProdName() {
        return prodName;
    }
    
    public int getProdQuantity() {
        return prodQuantity;
    }
    public int getfarmerCount() {
        return farmerCount;
    }
    
    public double getSalesPrice() {
        return salesPrice;
    }
    
    public double getPrice() {
        return price;
    }
    
    boolean isProduce() {
        return isProduce;
    }
    
    int produceCount() {
        return produceCount;
    }
    
    public void Harvested() {
        this.isProduce = false;
        this.produceCount = 0;
    }
    
    int Cycle = 0;
    private int animalStartCycle = 3;
    private int animalMiddleCycle = 7;
    private int animalEndCycle = 14;
    
    public void Cycle() {
        
        this.Cycle++;
        
        if(this.Cycle < animalStartCycle) {
            System.out.println(this.name + " is not old enough to produce");
            return;
        }
        
        if(this.Cycle > animalStartCycle) {
            System.out.println(this.name + " is producing.");
            return;
        }
        
        if(this.Cycle == animalMiddleCycle) {
            System.out.println(this.name + " is 7 years old, and it is at a perfect age to produce.");
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
