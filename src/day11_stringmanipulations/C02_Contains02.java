package day11_stringmanipulations;

import java.util.Scanner;

public class C02_Contains02 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com
		// iceriyorsa “Email adresiniz kaydedildi”, icermiyorsa “Lutfen gmail mail
		// adresinizi giriniz.. “ yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen mail adresinizi giriniz : ");
		String mail = scan.nextLine();
		String mailSart = "@gmail.com";

		if (mail.contains(mailSart)) { // ("@gmail.com") da yazilabilir.
			if (mail.indexOf(mailSart) == mail.lastIndexOf(mailSart)) {
				System.out.println("Email adresiniz kaydedildi");
			} else {
				System.out.println("Lutfen gmail mail adresinizi dogru giriniz..");
			}

		} else {
			System.out.println("Lutfen gmail mail adresinizi giriniz..");
		}

		scan.close();

	}

}
