package day09_practice01;

import java.util.Scanner;

public class C02_Practice02 {

	public static void main(String[] args) {
		/*
		 * Problem Tan�m� Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi
		 * yapan kodu yaz�n�z a'n�n karesinden b'nin karesini cikarip c nin 3 katina
		 * bolunuz �rnek Ekran ��kt�s� a say�s�n� giriniz: 5 b say�s�n� giriniz: 3 c
		 * say�s�n� giriniz: 1 sonu� : 5.333333333333333
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("a, b ve c sayilarini giriniz : ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double sonuc = ((a * a) - (b * b)) / (3 * c);

		System.out.println("Sonuc : " + sonuc);

		scan.close();
	}

}
