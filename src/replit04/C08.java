package replit04;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan
		 * olu�an yeni bir String yazd�r�n
		 * 
		 * Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("isim giriniz : ");
		String str = scan.next();
		while (str.length() < 2) {
			System.out.print("isim giriniz : ");
			str = scan.next();
		}

		int count = 0;
		String str1 = str.substring(str.length() - 2);
		switch (count) {
		case 0:
			str1 += str.substring(str.length() - 2);
			count++;
		case 1:
			str1 += str.substring(str.length() - 2);
			break;
		}
		System.out.println(str1);
		scan.close();

	}

}
