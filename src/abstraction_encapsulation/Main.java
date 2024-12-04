package abstraction_encapsulation;

public class Main {
	public static void main(String[]args) {
		Loan carLoan= new Loan(10.5,5,5000000);
		System.out.printf("%s %.2f %s\n","MONTHLY PAYMENT",carLoan.getMonthlyPayMent(),"KES");
		System.out.printf("%s %.2f %s\n","TOTAL PAYMENT",carLoan.getToatalPayment(),"KES");
		System.out.printf("%s\n","LOAN DATE "+carLoan.getLoanDate());
	}

}
