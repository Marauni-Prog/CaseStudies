package abstract_classes;

public class Main {
	public static void main(String[] args) {
//		GeometricObject circle= new Circle(12);
//		GeometricObject rec= new Rectangle(12,17);
//		GeometricObject rec1= new Rectangle(17,12);
//		System.out.println(compareArea(circle,rec));
//		System.out.println(compareArea(rec1,rec));
//		System.out.println(rec);
//		System.out.println(rec.getArea());
//		System.out.println(circle.getArea());		

		Rational r1 = new Rational(4, 2);

		Rational r2 = new Rational(2, 3);

		// Display results

		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));

		System.out.println(r1 + " − " + r2 + " = " + r1.subtract(r2));

		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));

		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));

		System.out.println(r2 + " is " + r2.doubleValue());

	}

	public static boolean compareArea(GeometricObject g1, GeometricObject g2) {
		return g1.getArea() == g2.getArea();
	}

}
