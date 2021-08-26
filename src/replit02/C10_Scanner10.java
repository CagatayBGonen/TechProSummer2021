package replit02;

import java.util.Scanner;

public class C10_Scanner10 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan dakika girmesini isteyin, Dakikalar� birka� y�l ve g�n say�s�na
		 * d�n��t�rmek i�in bir Java program� yaz�n.
		 * 
		 * INPUT:
		 * 
		 * Dakika say�s�: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yakla��k 6 y�l 210 g�nd�r
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
