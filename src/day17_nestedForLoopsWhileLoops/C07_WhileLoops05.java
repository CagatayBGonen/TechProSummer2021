package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C07_WhileLoops05 {
	
	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak uzere sayi isteyin
		 * toplam 200 oluncaya kadar sayi istemeye devam edin.
		 * Toplam 200'u gectiginde 
		 * kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin.
		 */
		Scanner scan = new Scanner (System.in);
		
		int num = 0;
		int sum = 0;
		int counter = 0;
		while (sum<200) {
			System.out.print("bir tamsayi giriniz : ");
			num = scan.nextInt();
			sum += num;
			counter++;
		}
		System.out.println(counter + " tane sayi girdiniz." + "\ngirdiginiz sayilarin toplami : " + sum);
		scan.close();
	}
		
}
