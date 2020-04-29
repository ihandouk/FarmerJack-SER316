package main.java.patterns.Decorator;

public class CowSound extends AnimalSounds {
    
    public CowSound(int soundStrength) {
        super(soundStrength, "Cows are low MOOin farmers walking by!.");
    }
}
