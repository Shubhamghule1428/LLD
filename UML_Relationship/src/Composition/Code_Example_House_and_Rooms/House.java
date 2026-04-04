package Composition.Code_Example_House_and_Rooms;

import java.util.ArrayList;
import java.util.List;

//Whole class - House
public class House {
	private String address;
	private String owner;
	private int yearBuilt;
	private List<Room> rooms; // Composition - House owns rooms exclusively

	public House(String address, String owner, int yearBuilt) {
		this.address = address;
		this.owner = owner;
		this.yearBuilt = yearBuilt;
		this.rooms = new ArrayList<>();

		System.out.println("\n=== House constructed at " + address + " ===");
		// House creates its rooms during construction
		initializeRooms();
	}

// House creates its own rooms - composition
	private void initializeRooms() {
		// Creating rooms as part of house construction
		rooms.add(new Room("Living Room", 300, 1, true));
		rooms.add(new Room("Kitchen", 150, 1, true));
		rooms.add(new Room("Master Bedroom", 250, 2, true));
		rooms.add(new Room("Bedroom 2", 180, 2, true));
		rooms.add(new Room("Bathroom 1", 80, 1, false));
		rooms.add(new Room("Bathroom 2", 70, 2, false));
		rooms.add(new Room("Garage", 200, 1, false));
	}

// Can add more rooms during house expansion
	public void addRoom(String name, double area, int floor, boolean hasWindow) {
		Room newRoom = new Room(name, area, floor, hasWindow);
		rooms.add(newRoom);
		System.out.println("Room added to house: " + name);
	}

// Cannot remove individual rooms - they're part of the structure
// (In real life, you'd renovate, not remove rooms from a house)

	public double getTotalArea() {
		return rooms.stream().mapToDouble(Room::getArea).sum();
	}

	public void paintAllRooms(String color) {
		System.out.println("\nPainting entire house " + color);
		for (Room room : rooms) {
			room.paint(color);
		}
	}

	public void renovateHouse() {
		System.out.println("\nRenovating entire house at " + address);
		for (Room room : rooms) {
			room.renovate();
		}
	}

	public void displayHouseDetails() {
		System.out.println("\n=== House Details ===");
		System.out.println("Address: " + address);
		System.out.println("Owner: " + owner);
		System.out.println("Year Built: " + yearBuilt);
		System.out.println("Total Area: " + getTotalArea() + " sq ft");
		System.out.println("Number of Rooms: " + rooms.size());
		System.out.println("\nRooms:");
		for (Room room : rooms) {
			System.out.println("  - " + room);
		}
	}

	public List<Room> getRooms() {
		// Return copy to prevent external modification
		return new ArrayList<>(rooms);
	}

// Destructor-like method - when house is demolished
	public void demolish() {
		System.out.println("\n=== DEMOLISHING HOUSE AT " + address + " ===");
		// All rooms are destroyed with the house
		for (Room room : rooms) {
			room.destroy();
		}
		rooms.clear();
		System.out.println("House demolished. All rooms destroyed.");
	}
}