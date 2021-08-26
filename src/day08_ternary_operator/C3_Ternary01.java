package day08_ternary_operator;

public class C3_Ternary01 {

	public static void main(String[] args) {
		/*
		 * Soru3 : int y = 1; int z = 1; int a = y<10 ? y++ : z++; System.out.println(y
		 * + “,” + z + “,” + a);
		 */

		int y = 1;
		int z = 1;
		int a = y < 10 ? y++ : z++;
		System.out.println(y + "," + z + "," + a);
		// ---------------------------------------------------------------
		int num = 50;
		String sonuc = num % 2 == 0 ? "Sayi Cift" : "Sayi Tek";
		
		System.out.println(sonuc);
		
		System.out.println(num>100 ? "sayi 100'den buyuk" : 10);
		 //direkt yazdirdigimiz zaman sonuclarýn ikisi ayni cinsten olmak zorunda degil
		
		String sonuc1 = num>100 ? "Sayi 100'den buyuk" : "10";
		System.out.println(sonuc1);

	}

}
