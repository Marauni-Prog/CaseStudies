package Course_class;

public class Main {
	public static void main(String[]args) {
		Course edu= new Course("EDUCATION ARTS");
		edu.addStudent("FRED");
		edu.addStudent("mark");
		edu.addStudent("keith");
		edu.addStudent("MUSEBE");
		edu.addStudent("WILSON");
		edu.addStudent("VION");
		System.out.println(edu);
		edu.dropStudent("fred");
		
	}
}
