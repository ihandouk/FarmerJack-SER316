package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.patterns.factory.Currency;

public class FarmerJackTest {
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void initTest() {

        assertEquals(200, Currency.getCurrency());
        assertEquals(1200, Currency.getreadyUpgrade());
    }

}
