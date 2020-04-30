package main.java.patterns.factory.fish;

public class Salmon extends FishFarm {
    
    /**
     * Fish products and sale prices.
     * @return
     */
    public Salmon() {
        name = "Salmon";
        salesName = "Salmon fillets";
        price = 40.00;
        salesPrice = 30.00;
    }
}
