package main.java.patterns.factory.Mediator;

import java.util.Timer;
import java.util.TimerTask;

import main.java.patterns.factory.LifeCycle;

public class TimeCycle {
    
    private Timer cycle;
    private static boolean isDay = false;
    private static int sunRise = 0;
    
    public TimeCycle(int seconds) {
        
        cycle = new Timer();
        
        if(isDay) {
            cycle.schedule(new Midnight(), seconds * 300);
        }else {
            cycle.schedule(new FiveAM(), seconds * 300);
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
        }
    }
}
