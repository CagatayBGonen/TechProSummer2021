package day09_practice01;

import java.util.Scanner;

public class C08_Practice08 {

	public static void main(String[] args) {
		/*
		 * A �ehrinden u�amak isteyen bir ki�i B �ehrine 500km C �ehrine 700km D �ehrine
		 * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
		 * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
		 * indirim gidis donus bilet alirsa ya� indirimlerinden hari� 20% indirim bu
		 * kosullara gore yolcudan gidece�i mesafeyi isteyip ucak bilet ucretini
		 * hesaplayan program yaz�n�z
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen gitmek istediginiz sehri giriniz : ");
		char destination = scan.next().toUpperCase().charAt(0);

		System.out.print("tek-yon / gidis-donus : ");
		String tekGidisDonus = scan.next().toLowerCase();

		System.out.print("Lutfen 24 yas ustu ve 65 yas alt� yolcu sayisini giriniz : ");
		int numYolcuYetiskin = scan.nextInt();

		System.out.print("Lutfen 65 yas ustu yolcu sayisini giriniz : ");
		int numYolcuYasli = scan.nextInt();

		System.out.print("Lutfen 12-24 yas aralag�ndaki yolcu sayisini giriniz : ");
		int numYolcuGenc = scan.nextInt();

		System.out.print("Lutfen 12 yasindan kucuk yolcu sayisini giriniz : ");
		int numYolcuCocuk = scan.nextInt();

		if (destination == 'B') {
			if (tekGidisDonus.equals("tek-yon")) {
				System.out.println("Toplam bilet fiyati : "
						+ ((0.5 * (500 * numYolcuCocuk * 0.10)) + (0.1 * (500 * numYolcuGenc * 0.10))
								+ (0.3 * (500 * numYolcuYasli * 0.10)) + (1 * (500 * numYolcuYetiskin * 0.10))));
			} else if (tekGidisDonus.equals("gidis-donus")) {
				System.out.println("Toplam bilet fiyati : "
						+ ((0.5 * (500 * numYolcuCocuk * 0.10)) + (0.1 * (500 * numYolcuGenc * 0.10))
								+ (0.3 * (500 * numYolcuYasli * 0.10)) + (1 * (500 * numYolcuYetiskin * 0.10))));
			}
		} else if (destination == 'C') {
			if (tekGidisDonus.equals("tek-yon")) {
				System.out.println("Toplam bilet fiyati : "
						+ ((0.5 * (700 * numYolcuCocuk * 0.10)) + (0.1 * (700 * numYolcuGenc * 0.10))
								+ (0.3 * (700 * numYolcuYasli * 0.10)) + (1 * (700 * numYolcuYetiskin * 0.10))));
			} else if (tekGidisDonus.equals("gidis-donus")) {
				System.out.println("Toplam bilet fiyati : "
						+ ((0.5 * (700 * numYolcuCocuk * 0.10)) + (0.1 * (700 * numYolcuGenc * 0.10))
								+ (0.3 * (700 * numYolcuYasli * 0.10)) + (1 * (700 * numYolcuYetiskin * 0.10))));
			}
		} else if (destination == 'D') {
			if (tekGidisDonus.equals("tek-yon")) {
				System.out.println("Toplam bilet fiyati : "
						+ ((0.5 * (900 * numYolcuCocuk * 0.10)) + (0.1 * (900 * numYolcuGenc * 0.10))
								+ (0.3 * (900 * numYolcuYasli * 0.10)) + (1 * (900 * numYolcuYetiskin * 0.10))));
			} else if (tekGidisDonus.equals("gidis-donus")) {
				System.out.println("Toplam bilet fiyati : "
						+ ((0.5 * (900 * numYolcuCocuk * 0.10)) + (0.1 * (900 * numYolcuGenc * 0.10))
								+ (0.3 * (900 * numYolcuYasli * 0.10)) + (1 * (900 * numYolcuYetiskin * 0.10))));
			}
		} else {
			System.out.println("Lutfen istenilen bilgileri giriniz...");
		}
		scan.close();

	}

}
