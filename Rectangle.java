package challenges.grandcircus;

public class Rectangle {

	// Class variables
	private double length;
	private double width;

	// Constructor
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	// Getter
	public double getLength() {
		return length;
	}

	// Setter
	public void setLength(double length) {
		this.length = length;
	}

	// Getter
	public double getWidth() {
		return width;
	}

	// Setter
	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {

		return length * width;

	}

}
