package main.java.patterns.factory;

public class farmTypes extends Factory {

    int Cycle = 0;
    private int readyCycle = 3;
    private int animalStartCycle = 3;
    private int animalMiddleCycle = 7;
    private int animalEndCycle = 14;
    
    public void Cycle() {
        
        this.Cycle++;
        
        if(this.Cycle < animalStartCycle) {
            System.out.println(this.name + " is not old enough to produce");
            return;
        }
        
        if(this.Cycle > animalStartCycle) {
            System.out.println(this.name + " is producing.");
            return;
        }
        
        if(this.Cycle == animalMiddleCycle) {
            System.out.println(this.name + " is 7 years old, and it is at a perfect age to produce.");
            return;
        }
        
        if(this.Cycle >= animalEndCycle) {
            System.out.println(this.name + " has died of old age.");
            return;
        }
        
        this.produceCount++;
        System.out.println(this.name + "cycle.");
        
        if(this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.name + " is ready to support the farm production process.");
        }
        
        this.produceCount++;
        System.out.println(this.nameCrop +" is growing, and it might be ready for harvest soon.");
        
        if(this.produceCount > readyCycle) {
            this.isProduce = true;
            System.out.println(this.nameCrop + "is ready for harvesting, let's make some MONEY!!");
        }
    }
}
