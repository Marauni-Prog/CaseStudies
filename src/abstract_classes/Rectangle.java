package abstract_classes;

public class Rectangle extends GeometricObject {
	private double width;
	private double length;

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {

		return length * width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length * width);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "GeometricObject: type Rectangle" + "\ncolor=" + getColor() +"\nLength= "+length+"\nWidth= " +width+"\nfilled=" + isFilled()
				+ "\ndateCreated=" + getDateCreated();
	}
}
