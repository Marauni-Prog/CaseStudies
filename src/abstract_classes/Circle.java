package abstract_classes;

public class Circle extends GeometricObject {

	private double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.round(radius * radius * Math.PI);
	}

	@Override
	public double getPerimeter() {
		return Math.round(radius * 2 * Math.PI);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double gerDiameter() {
		return radius * 2;
	}
	@Override
	public String toString() {
		return "GeometricObject: type Circle" + "\ncolor=" + getColor() +"\nradius= "+radius+ "\nfilled=" + isFilled()
				+ "\ndateCreated=" + getDateCreated();
	}

}
