package main.java.patterns.decorator;

public class SheepSound extends AnimalSounds {

    public SheepSound(int soundStrength) {
        super(soundStrength, "Sheep are running from the farmers, making a "
                + "laud bleating sound, and refusing to give up their WOOL!.");
    }
}

