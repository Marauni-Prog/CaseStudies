package exceptions;
//trying to understand how to declare an exception, throw and catch an exception;

//have also used the finally statement that ensures some code run despite the occurrence of an exception

public class Circle {
	private double radius;
	private static int numberOfObjects;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		this(1.0);
	}

	public double getRadius() {
		return radius;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
//declaring and throwing an exception;
	public double getArea() throws Exception {
		if (radius <= 0) {
			throw new Exception("RADIUS CANNOT BE ZORE OR A NEGATIVE");
		}
		return radius * radius * Math.PI;
	}

	public double getPerimeter() throws Exception {
		if (radius <= 0) {
			throw new Exception("RADIUS CANNOT BE ZORE OR A NEGATIVE");
		}
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle of radius=" + radius;
	}

}
