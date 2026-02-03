package LSP.badCode;

//This breaks when substituting Square for Rectangle
public class AreaCalculator {
	public void printArea(Rectangle rectangle) {
		rectangle.setWidth(5);
		rectangle.setHeight(4);
		// For Rectangle: expects 20, For Square: gets 16
		System.out.println("Area: " + rectangle.getArea());
	}
}