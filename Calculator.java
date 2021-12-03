package week1.day2;

public class Calculator {
	
	public double div (double num1, double num2) {
		return num1*num2;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.div(20,10));
		

	}

}
