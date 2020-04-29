package main.java.patterns.Mediator;

import java.util.Timer;
import java.util.TimerTask;

import main.java.patterns.factory.LifeCycle;

public class TimeCycle {
    
    static Timer timer;
    private static boolean isDay = false;
    private static int sunRise = 0;
    
    
    public TimeCycle(int seconds) {
        
        timer = new Timer();
        
        if(isDay) {
            timer.schedule(new Midnight(), seconds * 300);
        }else {
            timer.schedule(new FiveAM(), seconds * 300);
        }
        
    }
    
    
    class FiveAM extends TimerTask{
        
        public void run() {
            
            System.out.println("The early bird gets the worm Y'LL!");
            isDay = true;
            sunRise++;
            System.out.println("It is a new day: "+ sunRise);
            new TimeCycle(3);
            new LifeCycle();
            
            
        }
    }
    
    class Midnight extends TimerTask{
        
        public void run() {
            System.out.println("The sun is settin Y'LL, tomorrow we will be here again bright and early! \n");
            isDay = false;
            new TimeCycle(3);
            if(sunRise == 10) {
                timer.cancel();
                System.out.println("End of simulation.");
            }
            
        }
    }
}
