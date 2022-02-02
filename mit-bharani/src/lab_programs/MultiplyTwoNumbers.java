package lab_programs;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of i: ");
		int i = scan.nextInt();
		System.out.println("Enter the value of j: ");
		int j = scan.nextInt();
		int multiply = i*j;
		System.out.println("Multiply of two numbers: "+multiply);
	}

}
