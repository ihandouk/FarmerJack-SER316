package main.java.patterns.mediator;

import java.util.Timer;

import main.java.patterns.factory.Currency;

public class TimeCycle extends TimerTasks {
    
    Timer timer;  
    
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
                timer.schedule(new Fiveam(), seconds * 1000);
            }
        
        } else {
            System.out.println("Farm has reached capacity");  
            System.exit(0);
            
        }
    }    
}
