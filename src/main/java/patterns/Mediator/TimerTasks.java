package main.java.patterns.mediator;

import java.util.TimerTask;

import main.java.patterns.factory.LifeCycle;

public class TimerTasks {
    
    private static int sunRise = 0;
    static boolean isDay = true;
    
    static class Fiveam extends TimerTask {
        
        
        public void run() {

            System.out.println("The early bird gets the worm Y'LL!");
            isDay = true;
            sunRise++;
            System.out.println("It is a new day: " + sunRise);
            new TimeCycle(3);
            new LifeCycle();
            
   
        }
    }
    
    static class Midnight extends TimerTask {
        
        public void run() {
            System.out.println("The sun is settin Y'LL, "
                    + "tomorrow we will be here again bright and early! \n");
            isDay = false;
            new TimeCycle(3);
           

        }
    }

}
