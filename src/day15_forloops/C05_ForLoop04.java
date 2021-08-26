package day15_forloops;

import java.util.Scanner;

public class C05_ForLoop04 {

	public static void main(String[] args) {
		// Kullanicidan 100'den kucuk bir tamsayi isteyin.
		// 1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin
		
		Scanner scan = new  Scanner (System.in);
		System.out.print("Lutfen 100'den kucuk bir tamsayi giriniz : ");
		int num1 = scan.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			if (i%3 == 0 || i%5 == 0) {
				System.out.print(i + " ");
			} 
		}
		scan.close();
	}

}
