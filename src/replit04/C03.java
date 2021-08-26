package replit04;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		/*
		 * Verilen iki say�n�n (s�f�rdan b�y�k veya s�f�ra e�it) toplam�n� hesaplayan ve
		 * yazd�ran bir Java program� yaz�n.
		 * 
		 * Verilen tamsay�lar veya toplam 10'dan fazla basamakli olursa, "OverFlow"
		 * yazd�r�n.
		 * 
		 * Ornek:
		 * 
		 * INPUT :
		 * 
		 * 25
		 * 
		 * 46
		 * 
		 * OUTPUT :
		 * 
		 * Numaralarin Toplami:
		 * 
		 * 71
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi giriniz");
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		if (num1 < 0 || num2 < 0) {
			System.out.println("yanlis girdiniz tekrar sayi giriniz");
			num1 = scan.nextLong();
			num2 = scan.nextLong();
		} else if (num1 > 9999999999L || num2 > 9999999999L) {
			System.out.println("OverFlow");
		} else {
			long toplam = num1+num2;
			if (toplam > 9999999999L) {
				System.out.println("OverFlow");
			} else {
				System.out.println("Numaralarin Toplami:" + "\n" + toplam);
			}
		}
		scan.close();
		
		

	}

}
