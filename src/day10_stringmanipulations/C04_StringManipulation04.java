package day10_stringmanipulations;

import java.util.Scanner;

public class C04_StringManipulation04 {

	public static void main(String[] args) {
		/*
		 * Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		 * kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin - Girilen
		 * kelime cumlede kullanilmamis. - Girilen kelime cumlede 1 kere kullanilmis. -
		 * Girilen kelime cumlede 1’den fazla kullanilmis.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaziniz...");
		String str1 = scan.nextLine().toLowerCase();
		System.out.print("Lutfen bir kelime giriniz : ");
		String wrd2 = scan.next().toLowerCase();
		
		int ilkKullanimIndexi = str1.indexOf(wrd2);
		int sonKullanimIndexi = str1.lastIndexOf(wrd2);
		
		if (ilkKullanimIndexi == -1) {
			System.out.println("Girilen kelime cumlede kullanilmamis.");
		}else if (ilkKullanimIndexi==sonKullanimIndexi) {
			System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
		}else {
			System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis.");
		}
		
		scan.close();
		
		
		
		

	}

}
