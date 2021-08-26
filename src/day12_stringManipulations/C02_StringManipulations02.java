package day12_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations02 {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve
		// asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
		// kart no : **** **** **** 1234

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen isiminizi giriniz : ");
		String name = scan.nextLine();
		System.out.print("Lutfen soyisminizi giriniz : ");
		String surname = scan.nextLine();
		System.out.print("Lutfen kart no'yu giriniz : ");
		String cardNo = scan.nextLine();

		String nameEdited = name.substring(0, 1).toUpperCase() + // ilk harfi buyuk olarak verir.
				name.substring(1).replaceAll("\\w", "*");// ilk harften sonraki tum harfleri *'a cevirir

		String surnameEdited = surname.substring(0, 1).toUpperCase() + surname.substring(1).replaceAll("\\w", "*");

		String cardNoEdited = "**** **** **** " + cardNo.substring(15);

		System.out.println("isim-soyisim : " + nameEdited + " " + surnameEdited + "\nKart no : " + cardNoEdited);
		scan.close();
	}

}
