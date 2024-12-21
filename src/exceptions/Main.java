package exceptions;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle(0);
		Circle c1=new Circle(22);
		showArea_Perimeter(c);
		showArea_Perimeter(c1);
	}
	
	public static void showArea_Perimeter(Object o) {
		if(o instanceof Circle c) {
//			Catching an exception.
			try {
				System.out.println("The area is "+Math.round(c.getArea()));
				System.out.println("The perimeter is "+Math.round(c.getPerimeter()));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println(c);
			}
		}
		System.out.println();
	}
}
