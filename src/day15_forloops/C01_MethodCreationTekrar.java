package day15_forloops;

public class C01_MethodCreationTekrar {

	public static void main(String[] args) {
		/*
		 * soru : Bir oyun programinda oyuncuya level ve puanina gore bonus hesaplayan
		 * bir method yaziniz Bonus ekendikten sonra oyuncu yeni punaiyla oyuna devam
		 * edecek. (Oyun icinde birden fazla defa bonus fonksiyonu kullanilabilir)
		 * 
		 * Bonus kurali: ilk 10 level icin mevcut puan 1000'den az ise 50, 1000 veya cok
		 * ise 100 bonus 11-50 level arasi mevcut puanina yuzde 10'u kadar bonus 51.
		 * levelden itibaren puan 10.000'den az ise 100 bonus, 10.000'den cok ise mevcut
		 * puanina %15 kadar bonus
		 */
		int level = 20;
		int puan = 1500;

		puan += bonusHesapla(level, puan);
		// puan artik 1650
		
		System.out.println(puan);
		
		level++;
		puan =20000;
		
		puan += bonusHesapla(level, puan);
		
		System.out.println(puan);
		
		level = 90;
		puan = 7500;
		puan += bonusHesapla(level, puan);
		System.out.println(puan);
	}

	private static int bonusHesapla(int level, int puan) {
		int bonus = 0;
		if (level <= 10) {
			if (puan < 1000) {
				bonus = 50;
			} else {
				bonus = 100;
			}
		} else if (level <= 50) {
			bonus = puan*10/100;
		} else {
			if (puan < 10000) {
				bonus = 1000;
			}else {
				bonus = puan*15/100;
			}
		}
		return bonus;
	}

}
