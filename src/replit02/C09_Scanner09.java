package replit02;

import java.util.Scanner;

public class C09_Scanner09 {

	public static void main(String[] args) {
		/*
		 * Girilen zamanı saniyeye çeviren bir program yazınız.


			Örnek Çıktı:

			1 saat 10 dakika 50 saniye ==>

			4250 saniye
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("Saat giriniz : ");
		int saat = scan.nextInt();
		System.out.print("Dakika giriniz : ");
		int dakika = scan.nextInt();
		System.out.print("Saniye giriniz : ");
		int saniye = scan.nextInt();
		
		int donenSaat1 = saatDakika(saat);
		int saatinSaniyesi = saatDakika(donenSaat1);
		int dakikaninSaniyesi = saatDakika(dakika);
		
		System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye ==>");
		System.out.println(saatinSaniyesi+dakikaninSaniyesi+saniye+" saniye");
		scan.close();
	}

	public static int saatDakika(int saat) {
		
		
		
		return saat*60;
	}

}
