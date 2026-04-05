package Inheritance.Code_Example_Animal_Hierachy;

public class Cat extends Animal {
	private String color;
	private boolean isIndoor;

	public Cat(String name, int age, String color) {
		super(name, age, "Feline");
		this.color = color;
		this.isIndoor = true;
		System.out.println("Cat constructor called for: " + name);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Meow! Meow!");
	}

	@Override
	public void move() {
		System.out.println(name + " is walking gracefully");
	}

	// Cat-specific methods
	public void meow() {
		System.out.println(name + " is meowing softly");
	}

	public void purr() {
		System.out.println(name + " is purring contentedly");
	}

	public void scratchPost() {
		System.out.println(name + " is scratching the post");
	}

	public void climb() {
		System.out.println(name + " is climbing up the tree");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Color: " + color);
		System.out.println("Indoor: " + (isIndoor ? "Yes" : "No"));
	}

	public String getColor() {
		return color;
	}

	public void setIndoor(boolean indoor) {
		isIndoor = indoor;
	}
}