package java_basic_exercises;

import java.util.Scanner;

public class C04_Basic04 {

	public static void main(String[] args) {
		/*
		 * 6. Write a Java program to print the sum (addition), multiply, subtract,
		 * divide and remainder of two numbers. Go to the editor
		 * 
		 * Test Data:
		 * 
		 * Input first number: 125
		 * 
		 * Input second number: 24
		 * 
		 * Expected Output :
		 * 
		 * 125 + 24 = 149
		 * 
		 * 125 - 24 = 101
		 * 
		 * 125 x 24 = 3000
		 * 
		 * 125 / 24 = 5
		 * 
		 * 125 mod 24 = 5
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("first number: ");
		int num1 = scan.nextInt();
		System.out.print("second number: ");
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		int multiply = num1 * num2;
		int subtract = num1 - num2;
		int minus = num1 - num2;
		int divide = num1 / num2;
		int reNum = num1 % num2;

		System.out.format("Sum = %d%nMultiply = %d%nSubtract = %d%nMinus = %d%nDivide = %d%nRemainder = %d%n", sum,
				multiply, subtract, minus, divide, reNum);
		scan.close();
	}
}
