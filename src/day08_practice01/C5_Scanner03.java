package day08_practice01;

import java.util.Scanner;

public class C5_Scanner03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini vize ortalamasinin
		 * %30'u final notunun %70 alarak gecme notunu hesaplayiniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen vize1 notunuzu giriniz : ");
		double vize1 = scan.nextDouble();
		System.out.print("Lutfen vize2 notunuzu giriniz : ");
		double vize2 = scan.nextDouble();
		System.out.print("Lutfen final notunuzu giriniz : ");
		double finalNotu = scan.nextDouble();

		double vizeOrt = (vize1 + vize2) / 2;
		double gecmeNotu = (vizeOrt * 30 / 100) + (finalNotu * 70 / 100);
		System.out.println("Gecme notunuz : " + gecmeNotu);
		scan.close(); 
	}

}
