package proje01_basariliMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QATeam7Market {
	static List<String> urunler = new ArrayList<>();
	static List<Double> fiyatlar = new ArrayList<>();
	static List<String> sepetUrunlerList = new ArrayList<>();
	static List<Double> sepetKgList = new ArrayList<>();
	static List<Double> sepetFiyatList = new ArrayList<>();
	static double toplamFiyat;
	static Scanner scan = new Scanner(System.in);
	static int urunKodu;
	static double kg;

	public static void main(String[] args) {
		System.out.println("Hosgeldiniz");
		urunler.add("Domates");
		urunler.add("Patates");
		urunler.add("Biber");
		urunler.add("Sogan");
		urunler.add("Havuc");
		urunler.add("Elma");
		urunler.add("Muz");
		urunler.add("Cilek");
		urunler.add("Kavun");
		urunler.add("uzum");
		urunler.add("Limon");

		fiyatlar.add(2.10);
		fiyatlar.add(3.20);
		fiyatlar.add(1.50);
		fiyatlar.add(2.30);
		fiyatlar.add(3.10);
		fiyatlar.add(1.20);
		fiyatlar.add(1.90);
		fiyatlar.add(6.10);
		fiyatlar.add(4.30);
		fiyatlar.add(2.70);
		fiyatlar.add(0.50);

		do {
			urunListeleme();
			urunSecme();
			sepeteEkle(urunKodu, kg);
			sepetiYazdir();
			System.out.print("odemeye gecilsin mi?(evet/hayýr): ");
			String onay = scan.next().toLowerCase();
			if (onay.contains("evet")) {
				break;
			}
		} while (true);
		odeme();
		scan.close();

	}

	public static void urunListeleme() {
		System.out.println("calisti");
		for (var i = 0; i < urunler.size(); i++) {
			System.out.println(i + urunler.get(i) + fiyatlar.get(i));
		}

	}

	public static void urunSecme() {
		System.out.print("urun kodu: ");
		urunKodu = scan.nextInt();
		System.out.print("kg: ");
		kg = scan.nextDouble();
	}

	public static void sepeteEkle(int urunKodu, double kg) {
		double sepetFiyat = 0;
		sepetFiyat = fiyatlar.get(urunKodu) * kg;
		toplamFiyat += sepetFiyat;
		sepetUrunlerList.add(urunler.get(urunKodu));
		sepetKgList.add(kg);
		sepetFiyatList.add(fiyatlar.get(urunKodu));

	}

	public static void sepetiYazdir() {
		for (int i = 0; i < sepetUrunlerList.size(); i++) {
			System.out.println(i + 1 + ". urun " + sepetUrunlerList.get(i) + "/" + sepetFiyatList.get(i) + "/"
					+ sepetKgList.get(i));
		}
		System.out.println(toplamFiyat);
	}
	

	public static void odeme() {
		double alinanPara=0;
		do {
			toplamFiyat-=alinanPara;
			System.out.print("odemeniz gereken toplam fiyat " + toplamFiyat + "tl dir" + "\nne kadar odeyeceksiniz: ");
			alinanPara = scan.nextDouble();
			if (alinanPara>toplamFiyat) {
				System.out.println("para ustunuz : " + (alinanPara-toplamFiyat));
			}else if (alinanPara<toplamFiyat) {
				System.out.print(toplamFiyat-alinanPara + "tl eksik girdiniz. Lutfen eksigi tamamlayýnýz.");				
			}
		} while (alinanPara<toplamFiyat);
		System.out.println("Odemeniz tamamlanmýstýr. Bizi tercih ettiginiz icin tesekkur ederiz.");
	}

}
