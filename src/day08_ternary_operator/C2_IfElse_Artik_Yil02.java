package day08_ternary_operator;

import java.util.Scanner;

public class C2_IfElse_Artik_Yil02 {

	public static void main(String[] args) {
		/*
		 * Soru 10) Interview Question
		 * 
		 * Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini
		 * isteyin.
		 * 
		 * Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		 * 
		 * Kural 2: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece
		 * 400’un kati olan yillar artik yildir
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir yil giriniz : ");
		int year = scan.nextInt();

		if (year % 4 != 0) { // 4 un kati olmayanlar
			System.out.println("Girdiginiz yil artik yil degildir.");
		} else { // 4 un kati olanlar
			if (year % 100 == 0 && year % 400 != 0) {
				System.out.println("Girdiginiz yil artik yil degildir.");
			} else if (year % 100 == 0 && year % 400 == 0) {
				System.out.println("Girdigniz yil artik yildir.");
			} else {
				System.out.println("Girdigniz yil artik yildir. ");
			}
		}
		scan.close();
	}

}
