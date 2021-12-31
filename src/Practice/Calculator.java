package Practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");

		double d = scan.nextDouble();
		System.out.println("Enter second number:");

		double d1 = scan.nextDouble();		
		
		System.out.println("Enter operation:");
		String op = scan.next();
		
		double result =0;
		switch (op) {
		case "+":
			result=d-d1;
			System.out.println(result);
			break;
			
		case "-":
			result=d-d1;
			System.out.println(result);
			break;
		
		case "*":
			result=d*d1;
			System.out.println(result);
			break;
			
		case "/":
			result=d/d1;
			System.out.println(result);
			break;	

		default:
			System.out.println("Not valid operation");
			break;
		}
		
	}

}
