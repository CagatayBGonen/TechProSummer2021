package replit04;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim yazmasýný isteyin, adýn uzunluðu 3 olmalýdýr. Ardýndan,
		 * adýn ayný karakterlere sahip olup olmadýðýný kontrol edin.
		 * 
		 * Eger ayný karakterlere sahipse
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
