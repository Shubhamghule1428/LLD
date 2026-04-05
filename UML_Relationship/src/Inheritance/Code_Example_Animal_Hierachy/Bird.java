package Inheritance.Code_Example_Animal_Hierachy;

public class Bird extends Animal {
	private double wingspan; // in cm
	private boolean canFly;

	public Bird(String name, int age, double wingspan, boolean canFly) {
		super(name, age, "Avian");
		this.wingspan = wingspan;
		this.canFly = canFly;
		System.out.println("Bird constructor called for: " + name);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Chirp! Chirp!");
	}

	@Override
	public void move() {
		if (canFly) {
			fly();
		} else {
			System.out.println(name + " is hopping on the ground");
		}
	}

	// Bird-specific methods
	public void fly() {
		if (canFly) {
			System.out.println(name + " is flying with wingspan of " + wingspan + " cm");
		} else {
			System.out.println(name + " cannot fly (like penguins or ostriches)");
		}
	}

	public void chirp() {
		System.out.println(name + " is chirping melodiously");
	}

	public void buildNest() {
		System.out.println(name + " is building a nest");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Wingspan: " + wingspan + " cm");
		System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
	}

	public double getWingspan() {
		return wingspan;
	}

	public boolean canFly() {
		return canFly;
	}
}
