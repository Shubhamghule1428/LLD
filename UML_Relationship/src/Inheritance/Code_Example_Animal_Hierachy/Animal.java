package Inheritance.Code_Example_Animal_Hierachy;

//Parent/Base/Super Class
public abstract class Animal {
	// Protected - accessible in subclasses
	protected String name;
	protected int age;
	protected String species;

	// Constructor
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
		System.out.println("Animal constructor called for: " + name);
	}

	// Common behavior for all animals
	public void eat() {
		System.out.println(name + " is eating");
	}

	public void sleep() {
		System.out.println(name + " is sleeping (Zzz...)");
	}

	// Abstract method - must be implemented by children
	public abstract void makeSound();

	// Method that can be overridden
	public void move() {
		System.out.println(name + " is moving");
	}

	public void displayInfo() {
		System.out.println("\n=== Animal Info ===");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age + " years");
		System.out.println("Species: " + species);
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSpecies() {
		return species;
	}

	// Setters
	public void setAge(int age) {
		this.age = age;
	}
}