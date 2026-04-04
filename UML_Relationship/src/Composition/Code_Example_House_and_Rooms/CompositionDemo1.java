package Composition.Code_Example_House_and_Rooms;

public class CompositionDemo1 {
	public static void main(String[] args) {
		// Create house - rooms are created as part of house
		House myHouse = new House("123 Main Street", "John Doe", 2020);

		// Display house details
		myHouse.displayHouseDetails();

		// Add new room (house expansion)
		System.out.println("\n--- House Expansion ---");
		myHouse.addRoom("Study Room", 120, 2, true);

		// Modify rooms through house
		myHouse.paintAllRooms("Beige");

		// Renovate house
		myHouse.renovateHouse();

		// Display updated details
		myHouse.displayHouseDetails();

		// Cannot access rooms independently - they're part of house
		// Rooms don't exist outside the house context

		// When house is demolished, all rooms are destroyed
		System.out.println("\n--- Demolition ---");
		myHouse.demolish();

		// After demolition, rooms no longer exist
		// myHouse.getRooms() would return empty list

		// Compare with aggregation: If this was aggregation (like
		// University-Professor),
		// professors would still exist after university closes.
		// But rooms cannot exist without the house - that's composition.
	}
}