package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String Str = "welcome to chennai";
		int count = 0;
		for (int i=0; i<Str.length(); i++)
		{
			if(Str.charAt(i)=='n')
			{
				count++;
			}
		System.out.println("the character n occurence:" + count);
				
				
			}
		}
		

	}


