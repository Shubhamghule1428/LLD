package Inheritance.Code_Example_Animal_Hierachy;

public class Dog extends Animal {
	// Additional attributes specific to Dog
	private String breed;
	private boolean isTrained;

	// Constructor
	public Dog(String name, int age, String breed) {
		// Call parent constructor using super()
		super(name, age, "Canine");
		this.breed = breed;
		this.isTrained = false;
		System.out.println("Dog constructor called for: " + name);
	}

	// Implementing abstract method from parent
	@Override
	public void makeSound() {
		System.out.println(name + " says: Woof! Woof!");
	}

	// Overriding parent's method with specific implementation
	@Override
	public void move() {
		System.out.println(name + " is running on four legs");
	}

	// Dog-specific methods
	public void bark() {
		System.out.println(name + " is barking loudly!");
	}

	public void fetch(String item) {
		System.out.println(name + " is fetching the " + item);
	}

	public void wagTail() {
		System.out.println(name + " is wagging tail happily!");
	}

	public void train() {
		isTrained = true;
		System.out.println(name + " has been trained successfully!");
	}

	// Overriding displayInfo to add Dog-specific information
	@Override
	public void displayInfo() {
		super.displayInfo(); // Call parent's displayInfo
		System.out.println("Breed: " + breed);
		System.out.println("Trained: " + (isTrained ? "Yes" : "No"));
	}

	public String getBreed() {
		return breed;
	}

	public boolean isTrained() {
		return isTrained;
	}
}
