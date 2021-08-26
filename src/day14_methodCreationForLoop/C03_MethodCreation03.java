package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation03 {

	public static void main(String[] args) {
		/*soru 3)Email kontrolu yapan bir program yazin. Kullanicinin girdigi sifre:
		 - @ isareti icermiyorsa gecersiz email yazdirin
		 - @gmail.com icermiyorsa "Lutfen gmail adresinizi girin" yazdirin
		 - @gmail.com ile bitmiyorsa "yazimda bir sorun var, maili kontrol ediniz"
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen mailinizi yaziniz");
		String mail = scan.nextLine();
		mailControl(mail);
		scan.close();
	}

	public static void mailControl(String mail) {
		if (!mail.contains("@")) {
			System.out.println("gecersiz email");
		} else if (!mail.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi girin");
		} else if (!mail.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		} else {
			System.out.println("Mailiniz basariyla kaydedildi");
		}
		
	}

}
