package main.java.patterns.factory;

public abstract class Factory {

    protected String name;
    protected String nameCrop;
    protected String Sales;
    protected double salesPrice;
    protected double price;
    
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
    
}
