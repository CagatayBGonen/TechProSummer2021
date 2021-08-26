package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C05_WhileLoops03 {

	public static void main(String[] args) {
		/*
		 * Soru 4) 
		 * Kullanicidan baslangic ve bitis haflerini alin 
		 * ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		 * Kullanicinin hata yapmadigini farz edin.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("baslangic harfini giriniz : ");
		char firstLetter = scan.next().toUpperCase().charAt(0);
		System.out.print("bitis harfini giriniz : ");
		char lastLetter = scan.next().toUpperCase().charAt(0);
		char i = firstLetter;
		while (i<=lastLetter) {
			System.out.print(i + ",");
			i++;
		}
		scan.close();

	}

}
