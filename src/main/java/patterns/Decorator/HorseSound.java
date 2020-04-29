package main.java.patterns.decorator;

public class HorseSound extends AnimalSounds {
    /**
     * Class is designed to assign horse sound.
     * @param soundStrength
     * return
     */
    public HorseSound(int soundStrength) {
        super(soundStrength, "The horses are neighing laudly.");
        
        
    }
}
