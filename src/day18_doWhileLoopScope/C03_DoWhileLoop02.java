package day18_doWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek
		 * icin 0’a basmasini soyleyin.
		 * 
		 * Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif
		 * sayilarin toplaminin kac oldugunu yazdirin. kullanici negatif sayi girerse
		 * ignore edin
		 */

		double num = 5;
		int count = 0;
		double sum = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Lutfen toplamak icin pozitif sayilar girin" + "\n islemi bitirmek icin 0'a basin");
			num = scan.nextDouble();
			// kulanicidan aldıgım sayiyi pozitif mi diye konrtol edelim
			if (num > 0) {
				sum += num;
				count++;
			} else if (num < 0) {
				System.out.println("pozitif bir sayi girmeliydiniz" 
						+ "\nbu sayi negatif oldugu icin yok sayiyorum");
			}
		} while (num != 0);
		System.out.println("girdiginiz sayilardan " + count + " tanesi pozitifti" 
				+ "\nve pozitif sayilarin toplami : " + sum);
		scan.close();
	}

}
