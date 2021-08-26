package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_list01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. Kullanici
		 * "yeter" yazana kadar isim istemeye devam edin.
		 * 
		 * Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan
		 * kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
		 * 
		 * isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
		 * 
		 * Not : yeter icin kucuk buyuk harf onemli degil ancak isimler icin onemli
		 */
		Scanner scan = new Scanner(System.in);
		String isim = "";
		List<String> girilenIsimList = new ArrayList<>();
		int count = 0;
		do {
			System.out.print("isim giriniz : ");
			isim = scan.nextLine(); // kullanicidan bir isim aldim
			if (!isim.equalsIgnoreCase("yeter")) {
				girilenIsimList.add(isim);
			}
		} while (!isim.equalsIgnoreCase("yeter"));

		// karsilastirmal istedigimiz listeyi olusturalim
		// listenin uzunlugu degismeyecegi icin array olusturup, list'e cevirebilirim
		// boylece 6 ismi tek tek eklemek zorunda kalmam

		String isimler[] = { "Ali", "Veli", "Ayse", "Fatma", "Zeki", "Kemal" };
		List<String> isimList = Arrays.asList(isimler);

		// elimizde 2 tane liste var
		// 1- Kullacidan aldigimiz isimlerin oldugu --girilenIsimler--
		// 2- karsilastiracagimiz liste --isimList--

		System.out.println("Toplam " + girilenIsimList.size() + " isim girdiniz");

		for (int i = 0; i < girilenIsimList.size(); i++) {
			if (isimList.contains(girilenIsimList.get(i))) {
				count++;
			}
		}
		System.out.println("girilen isimlerden " + count + " tanesi bizde kayitli");

		scan.close();
	}

}
