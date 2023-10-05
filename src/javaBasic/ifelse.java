package javaBasic;

public class ifelse {
	/**
	public static void main(String args[])
	{
		int age = 9;
		if (age >= 18) {
		    System.out.println("You are an adult.");
		}
		else {
			System.out.println("You are not adult");
			
		}
	 */
	public static void main(String args[])
	{
		int income = 9000000;
		if (income > 900000 ) {
			System.out.println("Higher class");
		}
		else if (income < 900000 && income > 100000 ) {
			System.out.println("Middle class");
		}
		
		else {
			System.out.println("lower class");
		}
	

	}
}
