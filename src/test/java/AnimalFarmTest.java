package test.java;

import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import main.java.patterns.factory.animals.AnimalFarm;
import main.java.patterns.factory.animals.Cows;
import main.java.patterns.factory.animals.Horses;
import main.java.patterns.factory.animals.Sheep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Test class.
 * @author ihand.
 */
public class AnimalFarmTest {

    AnimalFarm.Buildfarm builder = new AnimalFarm.Buildfarm(); 
    AnimalFarm.Buildfarm builder1 = new AnimalFarm.Buildfarm(); 
    AnimalFarm.Buildfarm builder2 = new AnimalFarm.Buildfarm(); 
    AnimalFarm.Buildfarm horsesfarm = new AnimalFarm.Buildfarm(); 
    AnimalFarm.Buildfarm sheepfarm = new AnimalFarm.Buildfarm(); 
    AnimalFarm.Buildfarm cowsfarm = new AnimalFarm.Buildfarm();
    
    
    /**
     * setting up before test.
     */
    @Before
    public void setUp() {
        
        builder.product(new Horses()).productQuantity(3).farmerCount(2);  //specify components
        builder1.product(new Sheep());        
        builder2.product(new Cows());        
        horsesfarm.product(new Horses());        
        sheepfarm.product(new Sheep());
        cowsfarm.product(new Cows());

        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    //all three parameters specified
    public void farm1() {
        AnimalFarm farm1 = builder.create(); //build instance  
        assertEquals("Horses", farm1.getProdName());
        assertEquals(3, farm1.getProdQuantity());
        assertEquals(2, farm1.getfarmerCount());
    }
    
    @Test
    //only 1 parameter specified
    public void farm2() {
        AnimalFarm farm2 = builder1.create(); //build instance  
        assertEquals(2, farm2.getProdQuantity());
        assertEquals(6, farm2.getfarmerCount());
    }
    
    @Test
    //no parameters specified
    public void farm3() {
        AnimalFarm farm3 = builder2.create(); //build instance
        assertEquals(2, farm3.getProdQuantity());
        assertEquals(6, farm3.getfarmerCount());
    }
    
    @Test    
    public void horseFarm() {
        AnimalFarm horseFarm = horsesfarm.create(); //build instance  
        assertEquals("Horses", horseFarm.getProdName());
    }
    
    @Test    
    public void sheepFarm() {
        AnimalFarm sheepFarm = sheepfarm.create(); //build instance  
        assertEquals("Sheep", sheepFarm.getProdName());
    }
    
    @Test    
    public void cowFarm() {
        AnimalFarm cowFarm = cowsfarm.create(); //build instance  
        assertEquals("Cows", cowFarm.getProdName());
    }

}