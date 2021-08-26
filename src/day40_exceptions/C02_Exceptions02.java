package day40_exceptions;

import java.util.Scanner;

public class C02_Exceptions02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 1;
		while (count <= 2) {
			System.out.println("1.sayi : ");
			int num1 = scan.nextInt();
			System.out.println("2.sayi : ");
			int num2 = scan.nextInt();
			try {
			System.out.println("bolum: " + num1/num2);
			} catch (ArithmeticException e) {
				System.out.println("0'a bolunemez!");
				System.out.println(e.getMessage());				
				e.printStackTrace(); // java.lang.ArithmeticException: / by zero
									 // at projeKitapTakibi02.C02_Exceptions02.main(C02_Exceptions02.java:17
									 // tum verileri yazdirir.
			}
			count++;
		}
		System.out.println("sorunsuz bir sekilde sona geldi");
		scan.close();
		

	}

}
