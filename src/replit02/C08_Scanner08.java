package replit02;

import java.util.Scanner;

public class C08_Scanner08 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan üç basamaklý bir sayý girmesini ve bu sayýnýn basamaklarýnýn toplamýný bulmasýný isteyin.
   
   			Örnek Çýktý:

   			Verilen tamsayýnýn rakamlarý toplamý 10'dur.
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
