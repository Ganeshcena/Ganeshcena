package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String sep = "madam";
		String rev ="";
		int Strlength=sep.length();
		for (int i=(Strlength-1); i>=0;--i) {
   rev = rev+sep.charAt(i);
		}
		if (sep.equals (rev)) {
			System.out.println(sep + "is palindrome string");
		}
		else {
			System.out.println(sep + "is not a palindrome string");
		}
	}

}
