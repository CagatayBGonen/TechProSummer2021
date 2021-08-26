package day09_practice01;

import java.util.Scanner;

public class C03_Practice03 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		 *  formula
		    
		    c = (f-32)*5/9
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("Fahrenheit degeri giriniz : ");
		double f = scan.nextDouble();
		
		double c = (f-32)*5/9;
		System.out.println("Celsius degeri : " + c);
		scan.close();
	}

}
