package main.java.patterns.factory;



public abstract class Farm {

	private String name;
	private double Farmer;
	private double Animal;
    private double Crop;
    private double Predator;
	
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public double getFarmers() {
        return Farmer;
    }
    public void setFarmers(double newFarmer) {
        Farmer = newFarmer;
    }
    public double getAnimals() {
        return Animal;
    }
    public void setAnimals(double newAnimal) {
        Animal = newAnimal;
    }
    public double getCrops() {
        return Crop;
    }
    public void setCrops(double newCrop) {
        Crop = newCrop;
    }
    public double getPredators() {
        return Predator;
    }
    public void setPredators(double newPredator) {
        Predator = newPredator;
    }

	public void Farmers() {
	    
	    System.out.println(getName() + "First farm has: " + getFarmers());
	}

	public void Animals() {
	    System.out.println(getName() + "First farm has: " + getAnimals());
	}
	public void Crops() {
        
        System.out.println(getName() + "First farm has: " + getCrops());
    }

    public void Predators() {
        System.out.println(getName() + "First farm has: " + getPredators());
    }

}
