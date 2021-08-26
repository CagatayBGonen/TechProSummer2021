package day40_exceptions;

import java.util.Scanner;

public class Soru01 {
	/*
	 * Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi
	 * String sadece sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
	 * Kullanici sayilardan olusmayan bir String girerse “Girdiginiz String sayiya
	 * cevrilemez” yazdirin.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Carpma yapmak icin bir String giriniz: ");
		String str = scan.next();
	//	int strSayi = 0; 
		try {
			int strSayi = Integer.parseInt(str);
			System.out.println("carpma sonucu: "+strSayi*2);
		}catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevirilemez");
		}
		
		scan.close();

	}

}
