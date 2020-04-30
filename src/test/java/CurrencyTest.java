package test.java;

import static org.junit.Assert.assertEquals;

import main.java.patterns.factory.Currency;
import main.java.patterns.factory.animals.AnimalFarm;
import main.java.patterns.factory.animals.Horses;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Test class.
 * @author ihand.
 */
public class CurrencyTest {

    AnimalFarm.Buildfarm builder = new AnimalFarm.Buildfarm();
    AnimalFarm horses = new Horses();
    
    /**
     * setting up before test.
     */
    @Before
    public void setUp() {        
        builder.nameOne("Test").product(horses)
        .productQuantity(3).farmerCount(6); //specify components
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void currencyCurrentCurrencyTest() {
        assertEquals(600, Currency.getCurrency());
    }
    
    @Test
    public void currencySetCurrencyTest() {
        Currency.setCurrency(500);
        assertEquals(500, Currency.getCurrency());
        Currency.setCurrency(100);
        assertEquals(100, Currency.getCurrency());
    }
    
    @Test
    public void currencyAddCurrencyTest() {
        Currency.addCurrency(100);
        assertEquals(300, Currency.getCurrency());
        Currency.addCurrency(-100);
        assertEquals(200, Currency.getCurrency());
    }
    
    @Test
    public void currencyGetGoalTest() {        
        assertEquals(1200, Currency.getreadyUpgrade());
    }
    
    @Test
    public void currencySetCurrencyTest1() {   
        Currency.setCurrency(700);
        assertEquals(1200, Currency.getreadyUpgrade());
        Currency.setCurrency(600);
        assertEquals(1200, Currency.getreadyUpgrade());        
    } 
    

}
