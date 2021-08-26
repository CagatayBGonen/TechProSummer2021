package day09_practice01;

import java.util.Scanner;

public class C01_Practice {

	public static void main(String[] args) {
		/*
		 * Problem Tan�m� Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n�
		 * hesaplayan kod yaz�n�z. �rnek Ekran ��kt�s� birinci kenar: 12 ikinci kenar: 5
		 * hipotenus: 13 k�k almak i�in Math.sqrt(sayi) metodunu kullan�n�z
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
