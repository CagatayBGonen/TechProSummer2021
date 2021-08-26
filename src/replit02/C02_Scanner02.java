package replit02;

import java.util.Scanner;

public class C02_Scanner02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan karenin kenar uzunluðunu alýn ve karenin alanýný ve çevresini
		 * konsola yazdýran bir program yazýn.
		 * 
		 * Ornek Cikti :
		 * 
		 * Alan: 9
		 * 
		 * Cevre: 12
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen karenin kenar uzunlugunu giriniz : ");
		int edge = scan.nextInt();
		int squareArea = edge*edge;
		int squareCircumference = 4*edge;
		System.out.println("Alan: " + squareArea);
		System.out.println("Cevre: " + squareCircumference);
		scan.close();
	}

}
