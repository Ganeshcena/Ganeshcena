package week3.day1;

import week1.day2.Calculator;

public class CalculatorDiv {

	public void div(int num1, int num2) {
		System.out.println(num1/num2);
	}
	
	public void div(int num1, int num2, int num3) {
		System.out.println(num1/num2/num3);
	}
	
	
	
	
	
	public static void main(String[] args) {
		CalculatorDiv calc = new CalculatorDiv();
		calc.div(47, 89);
		calc.div(56, 67, 68);
		

	}

}
