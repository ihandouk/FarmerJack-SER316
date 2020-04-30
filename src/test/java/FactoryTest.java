package test.java;

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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {
    
    Factory coffee = new Coffee();
    Factory swordfish = new SwordFish();
    Factory apples = new Apples();
    Factory orange = new Oranges();
    AnimalFarm horse = new Horses();
    AnimalFarm cow = new Cows();
    AnimalFarm sheep = new Sheep();
    Factory horseHar = new Salmon();
    AnimalFarm.Buildfarm builder1 = new AnimalFarm.Buildfarm();
    AnimalFarm.Buildfarm builder2 = new AnimalFarm.Buildfarm();
    
    /**
     * setting up before test.
     */
    @Before
    public void setUp() {        
        builder1.nameOne("Test").product(horse).productQuantity(5).farmerCount(4);
        builder2.nameOne("Test2").product(cow);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void nametest() {
        assertTrue(apples.getName().equals("Apples"));
    }
    
    @Test
    public void horseAgeTest() {
        assertEquals(0, horse.getCycle());
        assertEquals(14, horse.getOldAge());
    }
    
    
    @Test
    public void sheepAdultAgeTest() {
        assertEquals(14, cow.getOldAge());
    }
    
    @Test
    public void sheepDeathAgeTest() {
        assertEquals(0, sheep.getCycle());
    }
    
    @Test
    public void testHarvested() {
        horseHar.isProduce = true;
        horseHar.produceCount = 3;
        horseHar.harvested();
        assertEquals(false, horseHar.isProduce());
        assertEquals(0, horseHar.getProduceCount());
    }
    
    @Test
    public void animalAge() {
        AnimalFarm farm1 = builder1.create(); //build instance
        horse.cycle(); // age once
        assertEquals(1, horse.getCycle());
        
        for (int i = 0; i < 2; i++) {  //age two more times
            horse.cycle();
        }
        
        assertEquals(3, horse.getCycle());
        
        for (int i = 0; i < 2; i++) {  //age two more times
            horse.cycle();
        }
        
        assertEquals(5, horse.getCycle());
        
        for (int i = 0; i < 9; i++) {  //age 9 more times
            horse.cycle();
        }     
        
        horse.harvested();
        assertEquals(false, horse.isProduce);
        assertEquals(0, horse.produceCount);
    }
    
    
    @Test
    public void productAge() {
        AnimalFarm farm2 = builder2.create(); //build instance
        horse.cycle(); // age once
        assertEquals(0, horse.getProduceCount());
        for (int i = 0; i < 2; i++) {  //age two more times
            horse.cycle();
        }
    }
}