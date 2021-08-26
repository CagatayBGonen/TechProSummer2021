package day08_practice01;

import java.util.Scanner;

public class C3_Scanner01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar
		 * ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 Output : Girdiginiz sayinin birler basamagi : 3
		 * Girdiginiz sayinin onlar basamagi : 5 Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen uc basamaklý bir tamsayi giriniz : ");
		int num = scan.nextInt();

		int birler = num % 10;
		int onlar = num / 10 % 10;
		int yuzler = num / 100;

		System.out.println(
				"Girdiginiz sayinin birler basamagi : " + birler + "\n" + "Girdiginiz sayinin onlar basamagi : " + onlar
						+ "\n" + "Girdiginiz sayinin yuzler basamagi : " + yuzler);

		scan.close();
	}

}
