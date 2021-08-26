package day18_doWhileLoopScope;

import java.util.Scanner;

public class C02_DoWhileLopp01 {

	public static void main(String[] args) {
		// kullanicidan iki pozitif sayi isteyin
		// kullanici negatif sayi girdiðinde
		// girilen negatif sayilari yok sayip
		// kullanici dogru giris yaptýgýnda "well done" ve sayilarin carpini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki pozitif tamsayi giriniz");

		int num1 = 0;
		int num2 = 0;
		do {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			if (num1 > 0 && num2 > 0) {
				System.out.println("Well done \ngirilen sayilarin carpimi : " + (num1 * num2));
			} else {
				System.out.println("Lutfen pozitif iki tamsayi giriniz");
			}
		} while (num1 <= 0 || num2 <= 0);

		scan.close();

	}

}
