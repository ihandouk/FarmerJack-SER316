package main.java.patterns.factory.animals;

public class Horses extends AnimalFarm {
    
    /**
     * Animal products and sale prices.
     * @return
     */
    public Horses() {
        name = "Horses";
        salesName = "Race horse";
        price = 90.00;
        salesPrice = 70.00;
    }
}
