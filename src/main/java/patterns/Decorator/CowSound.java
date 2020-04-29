package main.java.patterns.decorator;

public class CowSound extends AnimalSounds {
    
    public CowSound(int soundStrength) {
        super(soundStrength, "Cows are low MOOin farmers walking by!.");
    }
}
