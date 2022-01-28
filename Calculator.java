package aspire;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number:");
		int n1= scan.nextInt();
		System.out.println("Please enter another number:");
		int n2= scan.nextInt();
		int sum=n1+n2;
		System.out.println("The sum of two numbers:"+sum); 
		
		
	}

}
