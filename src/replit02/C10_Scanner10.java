package replit02;

import java.util.Scanner;

public class C10_Scanner10 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan dakika girmesini isteyin, Dakikalarý birkaç yýl ve gün sayýsýna
		 * dönüþtürmek için bir Java programý yazýn.
		 * 
		 * INPUT:
		 * 
		 * Dakika sayýsý: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yaklaþýk 6 yýl 210 gündür
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("dakika giriniz : ");
		int dakika = scan.nextInt();
		int yilNum = yilMethodu(dakika);
		int gunNum = gunMethodu(dakika);
		System.out.println(dakika + " dakika yaklasik " + yilNum + " yil " + gunNum + " gundur");
		scan.close();
	}

	public static int gunMethodu(int dakika) {

		return ((dakika / 60) / 24) % 365;
	}

	public static int yilMethodu(int dakika) {
		return (((dakika / 60) / 24) / 365);

	}

}
