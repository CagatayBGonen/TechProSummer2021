package replit02;

import java.util.Scanner;

public class C06_Scanner06 {

	public static void main(String[] args) {
		//Kullan�c�dan bir Float de�er girmesini isteyin, bu say�y� short de�i�ken tipine d�n��t�r�n ve konsolda yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Float bir deger giriniz : ");
		float a = scan.nextFloat();
		short b = (short)a;
		System.out.println(b);
		scan.close();
		
		

	}

}
