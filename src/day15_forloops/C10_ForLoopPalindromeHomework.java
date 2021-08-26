package day15_forloops;

import java.util.Scanner;

public class C10_ForLoopPalindromeHomework {

	public static void main(String[] args) {
		/*
		 * Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin
		 * girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir kelime giriniz : ");
		String str = scan.next();
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse += str.substring(i, i + 1);
		}
		if (str.equals(strReverse)) {
			System.out.println("girilen kelime palindrome bir kelimedir.");
		} else {
			System.out.println("girilen kelime palindrome bir kelime degildir.");
		}
		scan.close();
	}

}
