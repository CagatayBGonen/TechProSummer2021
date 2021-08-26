package day07_ifelsestatements;

import java.util.Scanner;

public class C8_NestedIfElse {

	public static void main(String[] args) {
		// Kullanicidan cinsiyet ve yas aliniz
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		// olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
		// emekli olamayacaksa emekli olamazsin ... yil calisman lazim yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen cinsiyetnizi belirtiniz\nErkek icin E, kadin icin K yaziniz");
		char gender = scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen yasinizi giriniz");
		int age = scan.nextInt();

		if (gender == 'K') { // kadin ise
			if (age >= 60) {
				System.out.println("emekli olabilirsin");
			} else {
				System.out.println("emekli olamazsin\ndaha " + (60 - age) + " yil calismalisin");
			}

		} else if (gender == 'E') { // erkek ise
			if (age >= 65) {
				System.out.println("emekli olabilirsin");
			} else {
				System.out.println("emekli olamazsin\ndaha " + (65 - age) + " yil calismalisin");
			}

		} else { // yanliþ girdi
			System.out.println("Erkek icin E, kadin icin K yaziniz");

		}
		scan.close();// Java derslerine ek olarak;
					 // pazartesi iki ders. ilk ders daha temel seviyede, geride kaldim, anlayamadim diyer arakadaþlar icin
					 // pazartesi ikinci derste, biraz daha mid level
		
					 // sali ayni saatte mecburi practice dersi var: sadece soru cozulurek tekrar yapilacak

	}

}
