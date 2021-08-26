package day15_forloops;

import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		/*
		 * Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve
		 * girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("10'dan kucuk bir tamsayi giriniz : ");
		int num = scan.nextInt();
		int num1 = 1;
		for (int i = 1; i <= num; i++) {
			num1 *= i;
		}
		System.out.println(num1);
		scan.close();
	}

}
