package replit02;

import java.util.Scanner;

public class C08_Scanner08 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan �� basamakl� bir say� girmesini ve bu say�n�n basamaklar�n�n toplam�n� bulmas�n� isteyin.
   
   			�rnek ��kt�:

   			Verilen tamsay�n�n rakamlar� toplam� 10'dur.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Uc basamakli bir sayi giriniz : ");
		int a = scan.nextInt(); // 213
		int rakamlarToplami = 0;
		
		int rakam = a%10;
		rakamlarToplami += rakam;
		a /= 10;
		rakam =a%10;
		rakamlarToplami += rakam;
		a /= 10;
		rakam = a%10;
		rakamlarToplami += rakam;
		a /= 10;
		
		
		System.out.println("Verilen tamsayinin rakamlari toplami " + rakamlarToplami + "'dur.");
		scan.close();

	}

}
