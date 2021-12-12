package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("the deposit amount is Rs.40,000");
	}
	

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.savings();
		ab.fixed();
		ab.deposit();
		

	}

}
