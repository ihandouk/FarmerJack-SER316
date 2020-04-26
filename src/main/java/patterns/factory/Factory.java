package main.java.patterns.factory;

public abstract class Factory {

    protected String name;
    protected String Sales;
    protected double salesPrice;
    protected double price;
    private int readyCycle = 3;
    boolean isProduce = false;
    int produceCount = 0;
    
    public String getName() {
        return name;
    }
    
    public String getSales() {
        return Sales;
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
    
    public void Cycle() {
        
        this.produceCount++;
        System.out.println(this.name +" is growing, and it might be ready for harvest soon.");
        
        if(this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.name + "is ready for harvesting, let's make some MONEY!!");
        }
        
        
    }
}
