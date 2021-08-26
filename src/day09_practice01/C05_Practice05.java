package day09_practice01;

import java.util.Scanner;

public class C05_Practice05 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan vize ve final notlarýný alýnýz. Kullanýcýn istediði oranlarda
		 * vize ve final yüzdeleri not ile not ortalamasýný hesaplayýp not ortalamasýný
		 * yazdýrýp 50 ve büyük ise "Tebrikler dersi baþarý ile geçtiniz..." küçük ise
		 * "Malesef dersten kaldýnýz..." yazdýrýnýz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen vize notunuzu giriniz : ");
		double vizeNot1 = scan.nextDouble();

		System.out.print("Lutfen 2. vize notunuzu giriniz : ");
		double vizeNot2 = scan.nextDouble();

		System.out.print("Lutfen final notunuzu giriniz : ");
		double finalNot = scan.nextDouble();

		System.out.print("Istenilen vize yuzdesi : ");
		double vizeYuzde = scan.nextDouble();

		System.out.print("Istenilen final yuzdesi : ");
		double finalYuzde = scan.nextDouble();

		double notOrt = ((((vizeNot1 + vizeNot2) / 2) * vizeYuzde) / 100) + ((finalNot * finalYuzde) / 100);

		if (notOrt >= 50) {
			System.out.println("Tebrikler dersi basari ile gectiniz.." + notOrt);
		} else if (notOrt >= 0) {
			System.out.println("Malesef dersten kaldiniz..." + notOrt);
		} else {
			System.out.println("Gecerli deger giriniz..." + notOrt);
		}
		scan.close();

	}

}
