package day05_wrapper_concatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {
		String name = "Mehmet";
		int num = 10;
		System.out.println(num);
		System.out.println(name.charAt(2)); // h

		// name. dedigimizde bircok method listeleniyor, çunku name variable'inin data
		// turu String
		// ve String non-primitve dir.
		// non-primitvlerde degerin yaninda methodlar vardir.
		// num. num variable'nin data turu int
		// ve int primitve'dir
		// primitive data turleri sadece value a sahiptirler, methodlar'i yoktur.

		// *************************
		// Java primitive data turleri icim de methodlarin kullanilabilmesi icin
		// her primitive data turu icin bir WRAPPER CLASS olusturmus
		// *************************

		Integer num1 = 10;
		System.out.println(num1);
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648

		// short'un min ve max degerlerini yazdirin

		System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);

		// Wrapper Class kullanimina ornek verelim
		String schoolNo = "858";

		// eger String bir variable sadece sayilardan olsuuyorsa bu string'i int'a
		// cevirebiliriz.

		int schoolNoWithNum = Integer.parseInt(schoolNo);

		// System.out.println(schoolNo++); schoolNo String olarak tanimladigi icin
		// matematiksel islem yapilamaz

		System.out.println(++schoolNoWithNum);

		Character firstLetter = 'a';
		System.out.println(firstLetter.charValue()); // a

		Character.toUpperCase('a');
		System.out.println(Character.toUpperCase('a')); // A

	}

}
