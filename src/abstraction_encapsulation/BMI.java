package abstraction_encapsulation;

public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public BMI(String name, int age, double weight, double height) {
		this.age=age;
		this.weight=weight;
		this.name=name;
		this.height=height;
	}
	
	public BMI(String name, double weight,double height) {
		this(name,20,weight,height);
	}
	public BMI(double weight, double height) {
		this("DEFAULT NAME",20,weight,height);
	}
	
	public double getBMI() {
		return weight/(height*height);
	}
	
	public void status() {
		if(getBMI()<18) {
			System.out.println("UNDERWEIGHT");
		}else if(getBMI()<24) {
			System.out.println("NORMAL WEIGHT");
		}else {
			System.out.println("OVERWEIGHT");
		}
	}

}
