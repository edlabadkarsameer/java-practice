package javaBasic;
import java.util.Scanner;


public class switchStatement {
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	int mon = 0;
	System.out.printf("Enter the number of month:");
	mon = input.nextInt();
	
	System.out.println("You have entered: "+mon);
	switch(mon)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("31 days");
		break;
	case 2:
		System.out.println("28 days");
		break;
	case 4:
	case 6:
	case 11:
	case 9:
		System.out.println("30 days");
		break;
	default:
			System.out.println("invalid  input");
	}
	}
}
