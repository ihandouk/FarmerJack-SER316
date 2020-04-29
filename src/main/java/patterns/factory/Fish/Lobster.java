package main.java.patterns.factory.fish;

public class Lobster extends FishFarm {
    
    /**
     * Fish products and sale prices.
     * @return
     */
    public Lobster() {
        name = "Lobster";
        salesName = "Lobster tail";
        price = 42.00;
        salesPrice = 35.00;
    }        
}
