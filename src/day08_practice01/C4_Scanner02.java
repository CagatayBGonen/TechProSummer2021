package day08_practice01;

import java.util.Scanner;

public class C4_Scanner02 {

	public static void main(String[] args) {
		/*
		 * Problem Tanýmý Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
		 * Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu
		 * ortalama 120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr? Örnek
		 * Ekran Çýktýsý Mesafeyi giriniz: 400 Hýzý giriniz: 100 Süre 4 saattir.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Mesafe ve hýz giriniz" + "\nmesafeyi girdikten sonra enter'a basiniz");
		double mesafe = scan.nextDouble();
		int hýz = scan.nextInt();
		double sure = mesafe / hýz;

		System.out.println("sure : " + sure + " saat");
		scan.close();
	}

}
