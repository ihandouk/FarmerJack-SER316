package test.java;

import static org.junit.Assert.assertEquals;

import main.java.patterns.factory.crops.Apples;
import main.java.patterns.factory.crops.Coffee;
import main.java.patterns.factory.crops.CropFarm;
import main.java.patterns.factory.crops.Oranges;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * Test class.
 * @author ihand.
 */
public class CropFarmTest {

    CropFarm.Buildfarm builder = new CropFarm.Buildfarm(); 
    CropFarm.Buildfarm builder1 = new CropFarm.Buildfarm(); 
    CropFarm.Buildfarm builder2 = new CropFarm.Buildfarm(); 
    CropFarm.Buildfarm applesfarm = new CropFarm.Buildfarm(); 
    CropFarm.Buildfarm coffeefarm = new CropFarm.Buildfarm(); 
    CropFarm.Buildfarm orangesfarm = new CropFarm.Buildfarm();
    
    /**
     * setting up before test.
     * for the following statment.
     */
    @Before
    public void setUp() {
        
        builder.product(new Apples()).productQuantity(3).farmerCount(2);  //specify components
        builder1.product(new Coffee());        
        builder2.product(new Oranges());        
        applesfarm.product(new Apples());        
        coffeefarm.product(new Coffee());
        orangesfarm.product(new Oranges());

        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    //all three parameters specified
    public void farm1() {
        CropFarm farm1 = builder.create(); //build instance  
        assertEquals("Apples", farm1.getProdName());
        assertEquals(3, farm1.getProdQuantity());
        assertEquals(2, farm1.getfarmerCount());
    }
    
    @Test
    //only 1 parameter specified
    public void farm2() {
        CropFarm farm2 = builder1.create(); //build instance  
        assertEquals("Coffee", farm2.getProdName());
        assertEquals(2, farm2.getProdQuantity());
        assertEquals(6, farm2.getfarmerCount());
    }
    
    @Test
    //no parameters specified
    public void farm3() {
        CropFarm farm3 = builder2.create(); //build instance
        assertEquals("Oranges", farm3.getProdName());
        assertEquals(2, farm3.getProdQuantity());
        assertEquals(6, farm3.getfarmerCount());
    }
    
    


    
    @Test    
    public void appleFarm() {
        CropFarm appleFarm = applesfarm.create(); //build instance  
        assertEquals("Apples", appleFarm.getProdName());
    }
    
    @Test    
    public void coffeeFarm() {
        CropFarm coffeeFarm = coffeefarm.create(); //build instance  
        assertEquals("Coffee", coffeeFarm.getProdName());
    }
    
    @Test    
    public void orangeFarm() {
        CropFarm orangeFarm = orangesfarm.create(); //build instance  
        assertEquals("Oranges", orangeFarm.getProdName());
    }

}
