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
	 * edilmeli do{}while(cevap); --> hay�r ise alisveris bitirilmeli, odeme talep
	 * edilmeli.
	 * 
	 * 6) public static void odeme(double toplamFiyat){println()}
	 * 
	 */
	//------------------------------------------------------------
	/* Basrili Market al��-veri� program�.
    *
    * 1. Ad�m: �r�nler ve fiyatlar� i�eren listeleri olu�turunuz.
              
    *          No     �r�n         Fiyat
              ====  =======        =========
               00   Domates         2.10 TL
               01   Patates         3.20 TL
               02   Biber           1.50 TL
               03   So�an           2.30 TL
               04   Havu�           3.10 TL
               05   Elma            1.20 TL
               06   Muz             1.90 TL
               07   �ilek           6.10 TL
               08   Kavun           4.30 TL
               09   �z�m            2.70 TL
               10   Limon           0.50 TL
   
    * 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz.
    * 3. Ad�m: Ka� kg sat�n almak istedi�ini sorunuz.
    * 4. Ad�m: Al�nacak bu �r�n� sepete ekleyiniz ve Sepeti yazd�r�n�z.
    * 5. Ba�ka bir �r�n al�p almak istemedi�ini sorunuz.
    * 6. E�er devam etmek istiyorsa yeniden �r�n se�me k�sm�na y�nlendiriniz.
    * 7. E�er bitirmek istiyorsa �deme k�sm�na ge�iniz ve �dem sonras�nda program� bitirinzi.
    */
}
