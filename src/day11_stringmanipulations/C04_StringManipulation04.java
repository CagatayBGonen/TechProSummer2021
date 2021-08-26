package day11_stringmanipulations;

public class C04_StringManipulation04 {

	public static void main(String[] args) {

		String ccNo = "Java 123 @#";

		System.out.println(ccNo.replace(" ", "")); // Java123@#

		System.out.println(ccNo); // Java 123 @#

		// raplaceAll() ile yapalým

		System.out.println(ccNo.replaceAll("\\s", "")); // bosluk (space) = "Java123@#"

		System.out.println(ccNo.replaceAll("\\S", "*")); // bosluk disindeki tum karakterler = "**** *** **"

		System.out.println(ccNo.replaceAll("\\w", "-")); // harfler ve rakamlar = "---- --- @#"

		System.out.println(ccNo.replaceAll("\\W", "#")); // harf ve rakamlar disindeki her sey = "Java#123###"

		System.out.println(ccNo.replaceAll("\\d", "0")); // digit(rakamlar) = "Java 000 @#"

		System.out.println(ccNo.replaceAll("\\D", "a")); // digit(rakamlar) disindeki = "aaaaa123aaa"
		// SYSO icinde yapilan manipulation'lar asil String'i degistirmez.
		System.out.println(ccNo);

		ccNo = "1234 5698 1278 5687"; // atama yapinca kalici olarak degistirmis oluruz
		System.out.println(ccNo);
	}

}
