package Course_class;

import java.util.*;

public class Course {
	private String courseName;
	private List<Student> student;
	private static int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
		student = new ArrayList<>();
		numberOfStudents = student.size();
	}

	public void addCourse(String courseName) {
		new Course(courseName);
	}

	public String getCourseNmae() {
		return courseName;
	}

	public Student getStudent(String name) {
		for (int i = 0; i < student.size(); i++) {
			Student t = student.get(i);
			String s = t.getName();
			if (s.equalsIgnoreCase(name)) {
				return student.get(i);
			}
		}
		return null;
	}

	public static int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void addStudents(List<Student> students) {
		students.addAll(students);
	}

	public void addStudent(String name) {
		;
		Student s = new Student(name);
		student.add(s);
		numberOfStudents++;
	}

	public void dropStudent(String name) {
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getName().equalsIgnoreCase(name)) {
				student.remove(i);
				numberOfStudents--;
			}
		}
	}

	@Override
	public String toString() {
		String print = "";
		for (int i = 0; i < student.size(); i++) {
			print += student.get(i).getName() + "\n";
		}
		return "Course [courseName=" + courseName + "]\nSTUDENTS=\n" + print;
	}

}
