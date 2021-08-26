package day40_exceptions;

import java.util.Scanner;

public class C09_Exceptions09 {
	/*
	 * Soru: Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan
	 * kucuk bir sayi girerse Exception verecek sekilde yazin.
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("yasiniz: ");
		int age = Integer.parseInt(scan.nextLine());
		
		//1.yol try-catch kullanmadan:

//		if (age>=0) {
//			System.out.println("yasiniz: "+age);
//		} else {
//			throw new IllegalArgumentException();// ozel durumlarda bizim hata kabul ettigimiz durumlar icin kullanilir. 
//		}
		
		//2.yol try-catch ile:
		
		try {
			if (age >= 0) {
				System.out.println("yasiniz: " + age);
			} else {
				throw new IllegalArgumentException();   // ozel durumlarda bizim hata kabul ettigimiz durumlar icin
														// kullanilir.
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("sorunsuz calisti");
		scan.close();								
		
		
		
	}

}
