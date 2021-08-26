package day09_switchCase;

public class C4_StringManipulation01 {

	public static void main(String[] args) {
		String isim = "Firat";
		String soyisim = "Korkmaz";

		System.out.println(isim + " " + soyisim); // Firat Korkmaz

		System.out.println(isim.concat(" ").concat(soyisim)); // Firat Korkmaz

		System.out.println(isim.charAt(2)); // r
		System.out.println(isim.charAt(4)); // t
		// System.out.println(isim.charAt(5));
		// java.lang.StringIndexOutOfBoundsException: String index out of range: 5

	}

}
