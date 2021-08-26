package day15_forloops;

import java.util.Scanner;

public class C04_ForLoop03 {

	public static void main(String[] args) {
		// Kullanicidan 100'den kucuk bir tamsayi isteyin.
		// 1'den baslayarak girilen sayiya kadar 3'un kati olan saiyilari yazdirin
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen 100'den kucuk bir tamssayi giriniz : ");
		int num1 = scan.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
