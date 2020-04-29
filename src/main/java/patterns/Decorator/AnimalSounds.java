package main.java.patterns.decorator;

import java.util.ArrayList;

public class AnimalSounds implements Affinities {
    
    protected int soundStrength;
    protected String description;
    protected ArrayList<AnimalSounds> animalSounds;
    
    /*
     * adds animal sound to characters in the farm.
     * Adding animal Affinities.
     * @return
     */
    void addSound(Affinities sound) {
        animalSounds = new ArrayList<AnimalSounds>();
        this.animalSounds.add(this);
        
    }
    
    /*
     * It allows for a sound description with the integer.
     * @return
     */
    AnimalSounds(int soundStrength, String description) {
        this.description = description;
        this.soundStrength = soundStrength;
        
        
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.description;
    }

    @Override
    public int getSoundStrength() {
        // TODO Auto-generated method stub
        return this.soundStrength;
    }

}
