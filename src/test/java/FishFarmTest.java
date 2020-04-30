package test.java;

import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import main.java.patterns.factory.fish.FishFarm;

import main.java.patterns.factory.fish.Lobster;
import main.java.patterns.factory.fish.Salmon;
import main.java.patterns.factory.fish.SwordFish;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Test class.
 * @author ihand.
 */
public class FishFarmTest {

    FishFarm.Buildfarm builder = new FishFarm.Buildfarm(); 
    FishFarm.Buildfarm builder1 = new FishFarm.Buildfarm(); 
    FishFarm.Buildfarm builder2 = new FishFarm.Buildfarm(); 
    FishFarm.Buildfarm swardfishFarm = new FishFarm.Buildfarm(); 
    FishFarm.Buildfarm salmonfarm = new FishFarm.Buildfarm(); 
    FishFarm.Buildfarm lobsterfarm = new FishFarm.Buildfarm();
    
    /**
     * setting up before test.
     */
    @Before
    public void setUp() {
        
        builder.product(new SwordFish()).productQuantity(3).farmerCount(2);  //specify components
        builder1.product(new Salmon());        
        builder2.product(new Lobster());        
        swardfishFarm.product(new SwordFish());        
        salmonfarm.product(new Salmon());
        lobsterfarm.product(new Lobster());

        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    //all three parameters specified
    public void farm1() {
        FishFarm farm1 = builder.create(); //build instance  
        assertEquals("SwordFish", farm1.getProdName());
        assertEquals(3, farm1.getProdQuantity());
        assertEquals(2, farm1.getfarmerCount());
    }
    
    @Test
    //only 1 parameter specified
    public void farm2() {
        FishFarm farm2 = builder1.create(); //build instance  
        assertEquals("Salmon", farm2.getProdName());
        assertEquals(3, farm2.getProdQuantity());
        assertEquals(6, farm2.getfarmerCount());
    }
    
    @Test
    //no parameters specified
    public void farm3() {
        FishFarm farm3 = builder2.create(); //build instance
        assertEquals("Lobster", farm3.getProdName());
        assertEquals(3, farm3.getProdQuantity());
        assertEquals(6, farm3.getfarmerCount());
    }
    
    @Test    
    public void swordFishFarm() {
        FishFarm swordFishFarm = swardfishFarm.create(); //build instance  
        assertEquals("SwordFish", swordFishFarm.getProdName());
    }
    
    @Test    
    public void salmonFarm() {
        FishFarm salmonFarm = salmonfarm.create(); //build instance  
        assertEquals("Salmon", salmonFarm.getProdName());
    }
    
    @Test    
    public void lobsterFarm() {
        FishFarm lobsterFarm = lobsterfarm.create(); //build instance  
        assertEquals("Lobster", lobsterFarm.getProdName());
    }
    

}


