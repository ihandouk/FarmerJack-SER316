package test.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import main.java.patterns.factory.Factory;
import main.java.patterns.factory.animals.AnimalFarm;
import main.java.patterns.factory.animals.Cows;
import main.java.patterns.factory.animals.Horses;
import main.java.patterns.factory.animals.Sheep;
import main.java.patterns.factory.crops.Apples;
import main.java.patterns.factory.crops.Coffee;
import main.java.patterns.factory.crops.Oranges;
import main.java.patterns.factory.fish.Salmon;
import main.java.patterns.factory.fish.SwordFish;

public class FactoryTest {
    
    Factory coffee = new Coffee();
    Factory swordfish = new SwordFish ();
    Factory apples = new Apples();
    Factory orange = new Oranges();
    AnimalFarm horse = new Horses();
    AnimalFarm cow = new Cows();
    AnimalFarm sheep = new Sheep();
    Factory salmon = new Salmon();
    AnimalFarm.Buildfarm builder1 = new AnimalFarm.Buildfarm();
    AnimalFarm.Buildfarm builder2 = new AnimalFarm.Buildfarm();
    
    @Before
    public void setUp() {        
        builder1.nameOne("Test").product(horse).productQuantity(5).farmerCount(4);  //specify components
        builder2.nameOne("Test2").product(cow);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void NameTest() {
        assertTrue(apples.getName().equals("Apples"));
    }
    
    @Test
    public void unicornAgeTest() {
        assertEquals(14, horse.getCycle());
        assertEquals(3, horse.getAdultCycle());
    }
    
    @Test
    public void oowlbearAdultAgeTest() {
        assertEquals(3, cow.getAdultCycle());
    }
    
    @Test
    public void sheepDeathAgeTest() {
        assertEquals(14, sheep.getCycle());
    }
    
    @Test
    public void testHarvested() {
        salmon.isProduce = true;
        salmon.produceCount = 3;
        salmon.harvested();
        assertEquals(false, salmon.isProduce());
        assertEquals(0, salmon.getProduceCount());
    }
    
    
    @Test
    public void productAge() {
        AnimalFarm farm2 = builder2.create(); //build instance
        horse.cycle(farm2); // age once
        assertEquals(0, horse.getProduceCount());
        for (int i = 0; i < 2; i++) {  //age two more times
            horse.cycle(farm2);
            }
    }
}