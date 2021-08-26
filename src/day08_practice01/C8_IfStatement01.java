package day08_practice01;

import java.util.Scanner;

public class C8_IfStatement01 {

	public static void main(String[] args) {
		/*
		 * Kulanýcýdan aracýnýn hýzýný alýnýz Trafik cezasýnýn deðerini hesaplayýn. 45
		 * hýz sýnýrýdýr. Eðer hýzýnýz 55-74 arasýnda ise: Ceza 100 $'dýr. Eðer hýzýnýz
		 * 75 - 84 arasýnda ise: Ceza 150 $'dýr. Eðer hýzýnýz 85 -94 arasýnda ise: Ceza
		 * 320 $'dýr. Eðer hýzýnýz 94'den daha fazla ise: Ceza 500 $'dýr. ve ayrýca,
		 * Eðer sürücünün ehliyeti yoksa cezaya 200 $ eklenir. Örn: Hýzýnýz 77 iken
		 * cezanýz 150$'dýr ama ehliyetiniz yoksa ceza 350 $ olur.
		 * ----------------------------------------- Örn; currentSpeed(Hýzýnýz) 87 ve
		 * isDriverLicenceAvailable(Ehliyeti var mý?) = true; sonuç 320 olmalýdýr.
		 * currentSpeed(Hýzýnýz) 65 ve isDriverLicenceAvailable(Ehliyeti var mý?) =
		 * false; sonuç 300 olmalýdýr.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("hizinizi girniz : ");
		int hiz = scan.nextInt();

		System.out.print("ehliyetiniz var ise  1 yoksa 0 yaziniz ");
		int ehliyet = scan.nextInt();

		if (ehliyet == 1) {

			if (hiz > 54 && hiz < 75) {
				System.out.println("Cezaniz 100 dolar..");

			} else if (hiz > 75 && hiz < 84) {
				System.out.println("Cezaniz 150 dolar..");
			} else if (hiz > 85 && hiz < 94) {
				System.out.println("Cezaniz 320 dolar..");
			} else if (hiz > 95) {
				System.out.println("Cezaniz 500 dolar..");
			}

		} else {
			if (hiz > 54 && hiz < 75) {
				System.out.println("Cezaniz 300 dolar..");

			} else if (hiz > 75 && hiz < 84) {
				System.out.println("Cezaniz 350 dolar..");
			} else if (hiz > 85 && hiz < 94) {
				System.out.println("Cezaniz 620 dolar..");
			} else if (hiz > 95) {
				System.out.println("Cezaniz 800 dolar..");
			} else {
				System.out.println("ceza ehliyet 300 dolar");
			}

		}
		scan.close();
	}

}
