package day31_varags_stringBuilder;

public class C01_Varags01 {

	public static void main(String[] args) {
		// verilen farkli sayidaki sayilarin toplamini bulan bir method yaziniz
		var sayi1 = 17;
		var sayi2 = 20;
		var sayi3 = 35;
		System.out.println(toplama(sayi1,sayi2));
		System.out.println(toplama(sayi1,sayi2,sayi3));

	}
	public static int toplama(int... sayi) {
		var toplama = 0;
		for (var each: sayi) {
			toplama += each;
		}
		return toplama;
	}

}
