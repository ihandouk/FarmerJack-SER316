package main.java.patterns.mediator;

import java.util.Timer;
import java.util.TimerTask;

import main.java.patterns.factory.Currency;
import main.java.patterns.factory.LifeCycle;

public class TimeCycle {
    
    Timer timer;
    private static boolean isDay = false;
    private static int sunRise = 0;
    
    boolean checkForUpgrade() {
        return Currency.getCurrency() >= Currency.getreadyUpgrade();
    }
    
    /**
     * Time Cycle Mediator.
     * @param seconds
     * return
     */
    public TimeCycle(int seconds) {
        
        if (!checkForUpgrade()) {
            timer = new Timer();
            if (isDay) {
                timer.schedule(new Midnight(), seconds * 1000);
            } else {
                timer.schedule(new fiveam(), seconds * 1000);
            }
        
        } else {
            System.out.println("Farm has reached capacity");

        }
    }
    
    
    static class fiveam extends TimerTask{
     
        public void run() {
            
            System.out.println("The early bird gets the worm Y'LL!");
            isDay = true;
            sunRise++;
            System.out.println("It is a new day: " + sunRise);
            new TimeCycle(0);
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
