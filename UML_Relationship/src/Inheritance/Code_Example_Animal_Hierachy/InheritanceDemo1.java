package Inheritance.Code_Example_Animal_Hierachy;

public class InheritanceDemo1 {
	
	public static void main(String[] args) {
		System.out.println("=== Creating Animals ===\n");

		// Creating Dog object
		Dog dog = new Dog("Buddy", 3, "Golden Retriever");

		// Creating Cat object
		Cat cat = new Cat("Whiskers", 2, "Orange");

		// Creating Bird object
		Bird bird = new Bird("Tweety", 1, 15.5, true);

		System.out.println("\n=== Dog Activities ===");
		dog.displayInfo();
		dog.eat(); // Inherited from Animal
		dog.makeSound(); // Overridden in Dog
		dog.move(); // Overridden in Dog
		dog.bark(); // Dog-specific
		dog.fetch("ball"); // Dog-specific
		dog.wagTail(); // Dog-specific
		dog.train();
		dog.sleep(); // Inherited from Animal

		System.out.println("\n=== Cat Activities ===");
		cat.displayInfo();
		cat.eat(); // Inherited from Animal
		cat.makeSound(); // Overridden in Cat
		cat.move(); // Overridden in Cat
		cat.meow(); // Cat-specific
		cat.purr(); // Cat-specific
		cat.scratchPost(); // Cat-specific
		cat.climb(); // Cat-specific
		cat.sleep(); // Inherited from Animal

		System.out.println("\n=== Bird Activities ===");
		bird.displayInfo();
		bird.eat(); // Inherited from Animal
		bird.makeSound(); // Overridden in Bird
		bird.move(); // Overridden in Bird (calls fly)
		bird.chirp(); // Bird-specific
		bird.buildNest(); // Bird-specific
		bird.sleep(); // Inherited from Animal

		// Polymorphism - Parent reference to child object
		System.out.println("\n=== Polymorphism Example ===");
		Animal[] animals = { dog, cat, bird };

		for (Animal animal : animals) {
			System.out.println("\n" + animal.getName() + ":");
			animal.makeSound(); // Calls overridden method based on actual object
			animal.move(); // Calls overridden method based on actual object
		}

		// Demonstrating inheritance
		System.out.println("\n=== Inheritance Demonstration ===");
		System.out.println("Dog is an Animal: " + (dog instanceof Animal));
		System.out.println("Cat is an Animal: " + (cat instanceof Animal));
		System.out.println("Bird is an Animal: " + (bird instanceof Animal));
	}
}
