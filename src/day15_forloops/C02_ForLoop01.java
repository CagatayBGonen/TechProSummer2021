package day15_forloops;

public class C02_ForLoop01 {

	public static void main(String[] args) {
		// 10'dan 20 ye kadar olan saiylari yazdiran bir loop olusturalim

		for (int i = 10; i < 21; i++) {

			System.out.print(i + " ");
		}

		// 100 ile 200 dahil aralarindaki 10 ile bolunebilen sayilari yazdirin
		System.out.println("");
		for (int i = 100; i <= 200; i += 10) {

			System.out.print(i + " ");

		}

		// 50'den 20'ye kadar (sinirler dahil) 3'er 3'er geri sayarak yazdiralim
		System.out.println("");
		for (int i = 50; i >= 20; i -= 3) {

			System.out.print(i + " ");
		}

		// 50 ile 100 arasinda uc ile bolunebilen sayilari yazdirin
		System.out.println("");
		for (int i = 50; i <= 100; i++) {

			if (i % 3 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println("");
		// eger degiskenimiz verilen artis veya artisla bitis noktasina ulsamýyorsa
		// sonsuz loop olusur
		// sistem cokene kadar loop calismaya devam eder
		/*
		 * for (int i = 10; i < 20; i--) { System.out.println(i + " "); }
		 */

		// eger baslangic degeri kosulu saglamiyporsa
		// loop body hic calismadan loop'un sonunda gider
		// yani loop islevsiz olur

	}

}
