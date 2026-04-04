package Composition.Code_Example_House_and_Rooms;

//Part class - Room
public class Room {
	private String name;
	private double area; // in square feet
	private int floor;
	private boolean hasWindow;
	private String wallColor;

	// Package-private constructor - only House can create rooms
	Room(String name, double area, int floor, boolean hasWindow) {
		this.name = name;
		this.area = area;
		this.floor = floor;
		this.hasWindow = hasWindow;
		this.wallColor = "White";
		System.out.println("Room created: " + name + " (" + area + " sq ft)");
	}

	public void paint(String color) {
		this.wallColor = color;
		System.out.println(name + " painted " + color);
	}

	public void renovate() {
		System.out.println("Renovating " + name);
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public int getFloor() {
		return floor;
	}

	public boolean hasWindow() {
		return hasWindow;
	}

	@Override
	public String toString() {
		return name + " - " + area + " sq ft, Floor " + floor + ", Color: " + wallColor
				+ (hasWindow ? " (Window)" : "");
	}

	// Package-private - called when house is destroyed
	void destroy() {
		System.out.println("Room " + name + " is being destroyed with the house");
	}
}
