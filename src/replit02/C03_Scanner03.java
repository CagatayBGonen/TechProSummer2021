package replit02;

import java.util.Scanner;

public class C03_Scanner03 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n ve dikd�rtgenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.

			�rnek ��kt�:

			Alan: 32

			�evre: 24
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen a kenarini giriniz : ");
		int a = scan.nextInt();
		System.out.print("Lutfen b kenarini giriniz : ");
		int b = scan.nextInt();
		
		int rectangleArea = a*b;
		int rectangleCircumference = 2*(a+b);
		System.out.println("Alan: " + rectangleArea + "\nCevre: " + rectangleCircumference);
		scan.close();

	}

}
