package day09_practice01;

import java.util.Scanner;

public class C01_Practice {

	public static void main(String[] args) {
		/*
		 * Problem Tanýmý Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü
		 * hesaplayan kod yazýnýz. Örnek Ekran Çýktýsý birinci kenar: 12 ikinci kenar: 5
		 * hipotenus: 13 kök almak için Math.sqrt(sayi) metodunu kullanýnýz
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen 1. kenarin uzunlugunu giriniz : ");
		double kenar1 = scan.nextDouble();

		System.out.print("Lutfen 2. kenarin uzunlugunu giriniz : ");
		double kenar2 = scan.nextDouble();

		double hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
		System.out.println("ucgenimizin hipotenusu : " + hipo);
		scan.close();
	}

}
