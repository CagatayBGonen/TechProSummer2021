package day11_stringmanipulations;

import java.util.Scanner;

public class C03_Contains03 {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
		// cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf
		// olarak
		// yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi
		// icermiyor” yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen bir cumle giriniz : ");
		String str1 = scan.nextLine().toLowerCase();
		
		if (str1.contains("buyuk")) {
			System.out.println(str1.toUpperCase());
		}else if (str1.contains("kucuk")) {
			System.out.println(str1.toLowerCase());
		}else {
			System.out.println("Cumle kucuk ya da buyuk kelimsei icermiyor");
		}
		scan.close();
		
	}

}
