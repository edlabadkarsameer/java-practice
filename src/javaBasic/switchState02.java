package javaBasic;
import java.util.Scanner;
public class switchState02 {
	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner (System.in);
		while (true){
			
			System.out.print("Enter the Number:");
			a = input.nextInt();
		switch(a%2) {
		case(0):
			System.out.println("even");
			break;
		case(1):
			System.out.println("odd");
			
	}}
	}

}
