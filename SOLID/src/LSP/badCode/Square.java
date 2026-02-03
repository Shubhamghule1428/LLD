package LSP.badCode;

public class Square extends Rectangle {
	@Override
	public void setWidth(int width) {
		this.width = width;
		this.height = width; // Breaks LSP
	}

	@Override
	public void setHeight(int height) {
		this.width = height;
		this.height = height; // Breaks LSP
	}
}