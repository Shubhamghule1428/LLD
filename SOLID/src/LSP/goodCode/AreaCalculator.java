package LSP.goodCode;

//Works correctly with any Shape implementation
public class AreaCalculator {
	public static void printArea(Shape shape) {
		System.out.println("Area: " + shape.getArea());
	}
	
	public static void main(String[] args) {
		printArea(new Square(6)); // Area: 36.0
		printArea(new Rectangle(4,5)); // Area: 20.0
		
	}
}