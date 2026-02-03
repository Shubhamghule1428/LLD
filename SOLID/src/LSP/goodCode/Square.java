package LSP.goodCode;

public class Square implements Shape {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
}