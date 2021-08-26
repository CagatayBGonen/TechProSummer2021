package day02_variables_scanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		//kullanicidan iki tamsayi alip bu sayilarin
		// toplam, fark ve carpimlerini yazdirin
		
		// kullanicidan deger almak icin 3 adim atmaliyiz
		// 1- Scanner objesi olusturalim
		
		Scanner scan = new Scanner(System.in);
		
		// 2- kullanicidan ne istedigimiz yazdiralim
		
		System.out.println("Lutfen iki tamsayi giriniz");
		
		// 3- next methodunu kullanarak girilen degerleri alip, olsuturdugumuz variable'lara atayalim
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Girdiðiniz sayirilarin toplami : " + (sayi1 + sayi2));
		
		scan.close();

	}

}
