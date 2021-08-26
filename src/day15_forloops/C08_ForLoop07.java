package day15_forloops;

import java.util.Scanner;

public class C08_ForLoop07 {

	public static void main(String[] args) {
		/* 
		 * Soru 8 ) Interview Question 
		 * Kullanicidan bir String isteyin 
		 * ve Stringi tersine ceviren bir program yazin.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen bir String giriniz : ");
		String str = scan.next();
		
		String strTersten = "";
		
		for (int i = 0; i < str.length(); i++) {
			strTersten += str.substring(str.length()-1-i, str.length()-i);
		}
		System.out.println(strTersten);
		scan.close();
			

	}

}
