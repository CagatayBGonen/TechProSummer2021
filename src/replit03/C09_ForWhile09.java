package replit03;

import java.util.Scanner;

public class C09_ForWhile09 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz.
		 * (Mulakat Sorusu)
		 * 
		 * 
		 * Input :1238
		 * 
		 * Output :Girilen Numananin Tersi: 8321
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("bir sayi giriniz : ");
		String numStr = scan.next();
		System.out.println("Input :" + numStr);
		System.out.print("Output :Girilen Numananin Tersi: ");
		for (int i = numStr.length()-1; i >= 0; i--) {
			System.out.print(numStr.charAt(i));
		}
		
		scan.close();
	}

}
