package day14_methodCreationForLoop;

import java.util.Scanner;

public class C04_MethodCreation04 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin
		 * 
		 * isim ve soyisim ilk harfleri buyuk diger harfler kucuk olacak sekilde. kk
		 * num. ise 4 rakamlýk 4 blok ve aralarinda bosluk olacak sekilde duzelten 2
		 * method yazin. ve programda kullanabilmek icin duzenlenmis hallerini geri
		 * dondurun.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen isiminizi giriniz : ");
		String clientName = scan.nextLine();
		clientName = nameControl(clientName);

		System.out.print("Lutfen soyisminizi giriniz : ");
		String clientSurname = scan.nextLine();
		clientSurname = nameControl(clientSurname);

		System.out.print("Lutfen kredi karti numaranizi giriniz : ");
		String cCNo = scan.nextLine();
		cCNo = creditCartControl(cCNo);

		System.out.println("isim-soyisim : " + clientName + " " + clientSurname + "\nkredi kart numarasi : " + cCNo);

		scan.close();

	}

	public static String creditCartControl(String cCNo) {
		cCNo = cCNo.trim();
		cCNo = cCNo.substring(0, 4) + " " + cCNo.substring(4, 8) + " " + cCNo.substring(8, 12) + " "
				+ cCNo.substring(12);
		return cCNo;
	}

	public static String nameControl(String clientName) {
		// bu methodun amaci musteri ismini nasil yazarsa yazsin
		// ilk harf buyuk digerleri kucuk harf olacak sekilde duzenlemek
		// basta sonda bosluk birakmissa onlari da yokedelim

		clientName = clientName.trim(); // bosluklari yok ettik
		clientName = clientName.substring(0, 1).toUpperCase() + clientName.substring(1).toLowerCase();
		// clientName de yaptigim degisiklikleri main method'a gonderebilmek icin
		// reurn type'i void yerine variable'in data turune uygun bir sekle
		// dondurmeliyiz
		return clientName;
	}

}
