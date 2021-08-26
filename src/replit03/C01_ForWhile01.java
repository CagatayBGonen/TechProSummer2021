package replit03;

import java.util.Scanner;

public class C01_ForWhile01 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri
		 * kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =�John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("isim giriniz : ");
		String name = scan.nextLine().toLowerCase();
		System.out.print("bir harf giriniz : ");
		char ch1 = scan.next().charAt(0);
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch1) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("giridiginiz harf bulunmamaktad�r");
		} else {
			System.out.println("Number of " + ch1 + " = " + count);
		}
		scan.close();
	}

}
