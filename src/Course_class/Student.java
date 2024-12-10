package Course_class;

public class Student {
	private String name;
	private static int regNumber=100;
	
	public Student(String name) {
		this.name=name;
		regNumber++;
	}


	public String getName() {
		return name;
	}

	public static int getRegNumber() {
		return regNumber;
	}

	
	
}
