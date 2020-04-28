package main.java.patterns.factory;

import java.util.Timer;
import java.util.TimerTask;

public class TimeCycle {
    
    private Timer cycle;
    static boolean isDay = false;
    static int sunRise = 0;
    
    public TimeCycle(int seconds) {
        
        cycle = new Timer();
        
        if(isDay) {
            cycle.schedule(new FiveAM(), seconds * 200);
        }else {
            cycle.schedule(new Midnight(), seconds * 200);
        }
    }
    
    public class FiveAM extends TimerTask{
        
        public void run() {
            System.out.println("The early bird gets the worm Y'LL!");
            isDay = true;
            sunRise++;
            System.out.println("Work Day: "+ sunRise++);
            new TimeCycle(3);
            new LifeCycle();
        }
    }
    
    public class Midnight extends TimerTask{
        
        public void run() {
            System.out.println("The sun is settin Y'LL, tomorrow is will be bright and early!");
            isDay = false;
            new TimeCycle(30);
        }
    }
}
