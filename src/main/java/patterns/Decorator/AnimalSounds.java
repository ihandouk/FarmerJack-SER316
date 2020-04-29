package main.java.patterns.Decorator;

import java.util.ArrayList;

public class AnimalSounds implements Affinities {
    
    protected int soundStrength;
    protected String description;
    protected ArrayList<AnimalSounds>animalSounds;
    
    public void addSound(Affinities sound) {
        animalSounds = new ArrayList<AnimalSounds>();
        this.animalSounds.add(this);
        
    }
    
    
    public AnimalSounds(int soundStrength, String description) {
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
