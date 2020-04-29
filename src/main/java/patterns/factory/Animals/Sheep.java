package main.java.patterns.factory.animals;

public class Sheep extends AnimalFarm {
    
    /**
     * Animal products and sale prices.
     * @return
     */
    public Sheep() {
        name = "Sheep";
        salesName = "Wool";
        price = 50.00;
        salesPrice = 40.00;
    }

}
