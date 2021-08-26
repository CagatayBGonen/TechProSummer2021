package day06_relational_operators_ifstatement;

import java.util.Scanner;

public class C5_IfStatements04 {

	public static void main(String[] args) {
		// Kullanicidan dikdörtgenin kenar uzunluklarini isteyin ve dikdörtgenin kare
		// olup olmadigini yazdirin.
		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen kenar uzunluklarindan birini tamsayi giriniz");

		int kenar1 = scan.nextInt();

		System.out.println("lutfen diger kenar uzunlugunu tamsayi giriniz");

		int kenar2 = scan.nextInt();

		if (kenar1 == kenar2) {
			System.out.println("kare");
		}
		if (kenar1 != kenar2) {
			System.out.println("kare degil");
		}
		scan.close();

	}

}
