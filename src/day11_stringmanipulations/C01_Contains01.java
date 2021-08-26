package day11_stringmanipulations;

import java.util.Scanner;

public class C01_Contains01 {
	public static void main(String[] args) {
		
		// kullanicidan bir cumle ve bir kelime alin
		// cumlede kelimenin kullanilip kullanilmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen bir cümle giriniz : ");
		String str1 = scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime giriniz : ");
		String word1 = scan.next().toLowerCase();
		
		//indexOf() kullanalim
		
		if (str1.indexOf(word1) != -1) {
			System.out.println("Kelime cumlede kullanilmistir.");
		}else {
			System.out.println("Kelime cumlede kullanilmamistir.");
		}
		
		// contains() kullanalim
		
		if (str1.contains(word1)) { // sadece string kullanilir
			System.out.println("Kelime cumlede kullanilmistir.");
		}else {
			System.out.println("Kelime cumlede kullanilmamistir.");
			
		}
		scan.close();
		
		//bu method cok kullanicakmis.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
