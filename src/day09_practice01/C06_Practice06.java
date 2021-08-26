package day09_practice01;

import java.util.Scanner;

public class C06_Practice06 {

	public static void main(String[] args) {
		/*
		 * Problem Tan�m� Kullan�c�dan �� adet say� alarak bu say�lar�n bir dik ��genin
		 * kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z (ipucu: Bir
		 * ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor ba�lant�s�ndan
		 * yararlanabilirsiniz) �rnek Ekran ��kt�s� birinci kenar� giriniz: 2 ikinci
		 * kenar� giriniz 15 ���nc� kenar� giriniz: 7 Bu bir dik ��gen de�ildir. Bu bir
		 * dik ��gendir
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
