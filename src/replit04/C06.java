package replit04;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim yazmas�n� isteyin, ad�n uzunlu�u 3 olmal�d�r. Ard�ndan,
		 * ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin.
		 * 
		 * Eger ayn� karakterlere sahipse
		 * 
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * 
		 * Eger ayni kaakterlere sahip degilse
		 * 
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * 
		 * Ternary kullanin.
		 */
		Scanner scan = new Scanner(System.in);
		String name = "";
		do {
			System.out.println("bir isim yaziniz : ");
			name = scan.next();
		} while (name.length() != 3);
		System.out.println(name.charAt(0) == name.charAt(1) ? "isim ayni karakterlere sahiptir."
				: name.charAt(0) == name.charAt(2) ? "isim ayni karakterlere sahiptir."
						: name.charAt(1) == name.charAt(2) ? "isim ayni karakterlere sahiptir."
								: "Dizenin benzersiz karakterleri var");
		scan.close();

	}

}
