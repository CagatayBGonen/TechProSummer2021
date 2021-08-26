package day09_switchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		/*
		 * Soru3 : Kullanicidan bir sayi girmesini isteyin 
		 * Girilen sayi 
		 * 10 ise “Iki
		 * basamakli en kucuk sayi 
		 * 100 ise “uc basamakli en kucuk sayi” 
		 * 1000 ise “dort basamakli en kucuk sayi”
		 * diger durumlarda “Girdigin sayiyi degistir” yazdirin
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num = scan.nextInt();
		
		switch (num) {
		case 10:
			System.out.println("Iki basamakli en kucuk sayi");
			break;
		case 100:
			System.out.println("Uc basamakli en kucuk sayi");
			break;
		case 1000:
			System.out.println("Dort basamakli en kucuk sayi");
			break;
		default:
			System.out.println("Girdigin sayiyi degistir");
			break;
		}
		scan.close();
	}

}
