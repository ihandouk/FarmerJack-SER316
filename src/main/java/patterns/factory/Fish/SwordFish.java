package main.java.patterns.factory.fish;

public class SwordFish extends FishFarm {
    
    /**
     * Fish products and sale prices.
     * @return
     */
    public SwordFish() {
        name = "SwordFish";
        salesName = "SwordFish steak";
        price = 50.00;
        salesPrice = 40.00;
    }        
}