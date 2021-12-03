package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println("Fibonacci Series Till"+ range + "terms:");
		{
			System.out.println(firstNum + " , ");
			sum = firstNum + secNum;
			secNum = sum;
			System.out.println("the count is:"+sum);
			
			
		}

	}

}
