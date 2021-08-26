package day09_practice01;

import java.util.Scanner;

public class C06_Practice06 {

	public static void main(String[] args) {
		/*
		 * Problem Tanýmý Kullanýcýdan üç adet sayý alarak bu sayýlarýn bir dik üçgenin
		 * kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz (ipucu: Bir
		 * üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor baðlantýsýndan
		 * yararlanabilirsiniz) Örnek Ekran Çýktýsý birinci kenarý giriniz: 2 ikinci
		 * kenarý giriniz 15 üçüncü kenarý giriniz: 7 Bu bir dik üçgen deðildir. Bu bir
		 * dik üçgendir
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("a kenarinin uzunlugu : ");
		double a = scan.nextDouble();
		System.out.print("b kenarinin uzunlugu : ");
		double b = scan.nextDouble();
		System.out.print("c kenarinin uzunlugu : ");
		double c = scan.nextDouble();
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Hatali giris yaptiniz");
		} else if ((a * a) + (b * b) == (c * c)) {
				System.out.println("Bu bir dik ucgendir");
			} else if ((a * a) + (c * c) == (b * b)) {
				System.out.println("Bu bir dik ucgendir");
			} else if ((c * c) + (b * b) == (a * a)) {
				System.out.println("Bu bir dik ucgendir");
			} else {
				System.out.println("Bu bir dik ucgen degildir");
			}
		scan.close();
		

	}

}
