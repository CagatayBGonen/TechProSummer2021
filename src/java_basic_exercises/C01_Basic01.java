package java_basic_exercises;

import java.util.Scanner;

public class C01_Basic01 {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to print 'Hello' on screen and then print your name
		 * on a separate line.
		 * 
		 * Expected Output :
		 * 
		 * Hello
		 * 
		 * Alexandra Abramov
		 */
		
		// 1. yontem
		
		System.out.println("Hello" + "\nAlexander Abramov");
		
		// 2.yontem
		
		Scanner scan = new Scanner(System.in);
		System.out.print("str giriniz : ");
		String str1 = scan.nextLine();
		System.out.print("isim-soyisim : ");
		String str2 = scan.nextLine();
		System.out.println(str1 + "\n" + str2);
		scan.close();
	
	}	

}
