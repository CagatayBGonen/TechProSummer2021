package replit03;

import java.util.Scanner;

public class C07_ForWhile07 {

	public static void main(String[] args) {
		/*
		 * Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
		 * 
		 * Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi
		 * bir sayý Mükemmel Sayý olarak bilinir.
		 * 
		 * 
		 * Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("bir tamsayi giriniz : ");
		int num = scan.nextInt();
		
		boolean perfectNum= perfectNum(num);
		if (perfectNum) {
			System.out.println(num + " Mukemmel Sayidir.");
		} else {
			System.out.println(num + " Mukemmel Sayi degildir.");
		}
		scan.close();
	}

	private static boolean perfectNum(int num) {
		int sum = 0;
		boolean perfectNum;
		for (int i = 1; i < num; i++) {
			if (num%i == 0) {
				sum += i;
			}
		}
		if (num == sum) {
			perfectNum = true;
		} else {
			perfectNum = false;
		}
		return perfectNum;
	}

}
