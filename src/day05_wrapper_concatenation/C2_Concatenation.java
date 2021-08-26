package day05_wrapper_concatenation;

public class C2_Concatenation {

	public static void main(String[] args) {

		String a = "Hello";
		int b = 2;
		int c = 3;
		String d = "World";
		// Eger matematiksel bir islemin icinde String kullanilirsa,
		// matematiksel oncelikler dikkate alinarak islem yapilir.
		// sira String ile toplamaya geldiginde toplama yerine Concatenation uygulanir

		System.out.println(a + b + c);// Hello23
		System.out.println(c + b + a);// 5Hello
		System.out.println(a + (b + c));// Hello5
		System.out.println(a + b * c);// Hello6

		// ************kesinlikle sayi ve harf yazmadan, sadece variable isminlerini
		// kullanarak**********

		// Hello1 yazdirin

		System.out.println(a + (c - b));// Hello1

		// Hello 5 World

		System.out.println(a + " " + (b + c) + " " + d); // Hello 5 World

		// Hello 34

		System.out.println(a + " " + c + (b + b)); // Hello 34

		// 7World

		System.out.println(b + b + c + d); // 7World

		// 34

		System.out.println(c + "" + (b + b)); // 34
		String fromInt1 = "" + c;
		String fromInt2 = "" + (b + b);
		System.out.println(fromInt1 + fromInt2); // 34

	}

}
