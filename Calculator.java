package day3Package;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Get 2 numbers from user
		System.out.println("Please enter 1st number : ");
		double firstNum = scan.nextDouble();
		System.out.println("Please enter 2nd number : ");
		double secondNum = scan.nextDouble();
		// Get user's choice of operation to perform
		System.out.println("Please choose an operation :\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		int choice = scan.nextInt();
		scan.close();

		switch (choice) {
		case 1:
			// Addition
			System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
			break;
		case 2:
			// Subtraction
			System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
			break;
		case 3:
			// Multiplication
			System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
			break;
		case 4:
			// Division
			// Check if denominator is 0. If yes, display cannot divide by 0 message
			if (secondNum == 0)
				System.out.println("Division by 0 not possible");

			else
				System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
			break;
		default:
			// Display Invalid choice error message when user does not select choice from 1
			// to 4
			System.out.println("Please enter valid choice ( 1, 2, 3 or 4 )");

		}

	}

}
