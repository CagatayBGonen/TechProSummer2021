package day06_relational_operators_ifstatement;

import java.util.Scanner;

public class C4_IfStatements03 {

	public static void main(String[] args) {
		/*
		 * kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin Ornek: ilkHarf=p
		 * output="Pazar, Pazartesi veya Persembe" ilkHarf=s output="sali" Buyuk kucuk
		 * harf problem olmamasý icin toUpperCase methodunu kullanin
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen istediginiz gun isminin ilk harfini giriniz");

		char harf = scan.next().toLowerCase().charAt(0);

		if (harf == 'p' || harf == 'P') {
			System.out.println("pazartesi, persembe veya pazar");
		}
		if (harf == 's') {
			System.out.println("sali");
		}
		if (harf == 'c') {
			System.out.println("carsamba, cuma veya cumartesi");
		}
		if (harf != 'p' && harf != 's' && harf != 'c') {
			System.out.println("lutfen gecerli bir harf giriniz");

		}
		scan.close();

	}

}
