package main.java.patterns.factory.crops;

public class Coffee extends CropFarm {
    
    /**
     * Coffee products and sale prices.
     * @return
     */
    public Coffee() {
        name = "Coffee";
        salesName = "Coffee Beans";
        price = 10.00;
        salesPrice = 8.45;
    }

}
