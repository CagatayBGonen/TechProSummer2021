package replit02;

import java.util.Scanner;

public class C02_Scanner02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan karenin kenar uzunlu�unu al�n ve karenin alan�n� ve �evresini
		 * konsola yazd�ran bir program yaz�n.
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
