package day25_constructor;

public class C03 {
	
	int sayi = 10;
	String isim = "Cagatay";
	// ayni package daki farkli class'lardan bu varible'lara ulasabiliriz
	// cunku access modifier yazmazsak default access modifier kullanilir
	// access modifier default ayný paketten her yerden kullanilabilir 
	
	public static void main(String[] args) {
		// sayi =20; sayi degiskeni static olmadigi icin main method'dan kullanamam
		// deneme(); bu method static olmadigi icin main method'dan cagiramam
		
		C03 obj1 = new C03();
		obj1.deneme();
		obj1.sayi = 20;
		// ayni class da oldugumuz halde static olmadigi icin kullanamadigmiz 
		// variable ve method'lari obje olusturarak kullanabiliriz
	}
	
	private void deneme() {
		System.out.println("deneme methodu calisti");
	}

}
