package week3.day1;

public class CalculatorSub {
	public void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public void sub(int num1, int num2, int num3) {
		System.out.println(num1-num2-num3);
	}

	public static void main(String[] args) {
		CalculatorSub calc = new CalculatorSub();
		calc.sub(23, 56);
		calc.sub(56, 46, 67);
				

	}

}
