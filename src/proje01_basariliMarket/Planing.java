package proje01_basariliMarket;

public class Planing {
	/*
	 * 1) urunler ve urun fiyaltleri(double) icin ayri ayri List olusuturulmali.
	 * listler class levelde olmali cunku: main method harici diger methodlarda
	 * kullanilacak Listelenen urunleri bir method() ile kullaniciga gosterilmeli bu
	 * mehtod bir cikti vermeyecegi ve sadece println calisacagi icin return type
	 * void parametresiz olmali method --> public static void urunListele(){for,
	 * println(i+urun+fiyat)};
	 * 
	 * 2) scanner classindan obj create edilmeli. urunListele() method call edilerek
	 * kullanici ekranina urun listesi gosterilemeli. kullanicidan urun kodu ve urun
	 * miktari istenmeli(println) int urunNo = kullanicinin girdigi urun kodu
	 * atamali double kg = kullanicinin giridgi urun miktari kg atamali
	 * 
	 * 3)musteri icin sepet olsuturulmali. sepetUrunlerList(String)
	 * sepetKgList(double) sepetFiyatList(double) public static void sepeteEkle(int
	 * urunNoKodu, double kg){sepetFiyat = urunFiyat*kg__list(double)}
	 * 
	 * her sepet alisverisinden sonra olusan sepet fiyatini toplayan bir primitive
	 * (double) toplamFiyat olusturulmali.
	 *
	 * toplamFiyat+=sepetFiyat
	 * 
	 * 4) sepete eklenen urunler, miktari, toplamFiyat ve sepetin son durmunu
	 * hesaplatip yazdirilamli. kullanici devam etmeyecegini sorabilelim. public
	 * static double(toplamFiyat) sepetYazdir(){println(urunler+fiyat+kg)}
	 * 
	 * 5) kullaniciya alisverise devam edip etmeyecegini sorulmali. cevab:
	 * boolean(true/false), String(e/h), int (1/0) cevap verisine gore islem akisi
	 * icin if kontrolu olmali --> cevap evet ise tum islemler bastan tekrar
	 * edilmeli do{}while(cevap); --> hayýr ise alisveris bitirilmeli, odeme talep
	 * edilmeli.
	 * 
	 * 6) public static void odeme(double toplamFiyat){println()}
	 * 
	 */
	//------------------------------------------------------------
	/* Basrili Market alýþ-veriþ programý.
    *
    * 1. Adým: Ürünler ve fiyatlarý içeren listeleri oluþturunuz.
              
    *          No     Ürün         Fiyat
              ====  =======        =========
               00   Domates         2.10 TL
               01   Patates         3.20 TL
               02   Biber           1.50 TL
               03   Soðan           2.30 TL
               04   Havuç           3.10 TL
               05   Elma            1.20 TL
               06   Muz             1.90 TL
               07   Çilek           6.10 TL
               08   Kavun           4.30 TL
               09   Üzüm            2.70 TL
               10   Limon           0.50 TL
   
    * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz.
    * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
    * 4. Adým: Alýnacak bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz.
    * 5. Baþka bir ürün alýp almak istemediðini sorunuz.
    * 6. Eðer devam etmek istiyorsa yeniden ürün seçme kýsmýna yönlendiriniz.
    * 7. Eðer bitirmek istiyorsa ödeme kýsmýna geçiniz ve ödem sonrasýnda programý bitirinzi.
    */
}
