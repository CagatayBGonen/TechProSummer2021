package day15_forloops;

import java.util.Scanner;

public class C11_ForLoopToplamaHomework {

	public static void main(String[] args) {
		/*
		 * Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
		 * tamsayilari toplayip, sonucu yazdiran bir program yaziniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("lutfen birinci tamsayi giriniz : ");
		int num1 = scan.nextInt();
		System.out.print("lutfen ikinci tamsayi giriniz : ");
		int num2 = scan.nextInt();
		int toplamNum = 0;

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				toplamNum += i;
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				toplamNum += i;
			}
		}
		System.out.println("Tum sayilarin toplami : " + toplamNum);
		scan.close();

	}

}
