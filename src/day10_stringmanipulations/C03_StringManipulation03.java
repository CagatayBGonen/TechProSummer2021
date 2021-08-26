package day10_stringmanipulations;

import java.util.Scanner;

public class C03_StringManipulation03 {

	public static void main(String[] args) {

		String str = "Java ogrenmek ne guzel";

		System.out.println(str.indexOf("e"));// 8

		System.out.println(str.indexOf(' '));// 4

		System.out.println(str.indexOf("mek"));// 10

		System.out.println(str.indexOf(""));// 0

		System.out.println(str.indexOf("j"));// -1

		System.out.println(str.indexOf("J"));// 0

		// kullanicidan bir String isteyin
		// girdigi String "Java" iceriyorsa "Aferin" yazdirin
		// icermiyorsa " daha cok calisman lazim" yazdirin
		// buyuk-kucuk harf onemsiz olsun

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sey yaziniz : ");
		String str2 = scan.nextLine().toLowerCase();

		// cumle.indexOf("java") // cumlede java varsa index donecek, yoksa -1 donecek

		if (str2.indexOf("Java") == -1) {
			System.out.println("Daha cok calisman lazim");
		} else {
			System.out.println("Aferin");
		}
		
		scan.close();

	}

}
