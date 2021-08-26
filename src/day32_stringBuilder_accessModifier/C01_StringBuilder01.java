package day32_stringBuilder_accessModifier;

import java.util.Arrays;

public class C01_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();// bos bir sb creat ettik
		sb1.append("faruk");
		System.out.println("sb1 ilk hali : " + sb1);// faruk
		sb1.append(" efehan");
		System.out.println("sb1 1.ekleme : " + sb1); // faruk efehan
		System.out.println("sb1 uzunlul : " + sb1.length()); // 12
		System.out.println("sb1 kapasite : " + sb1.capacity()); // 16
		System.out.println("sb1 son hali : " + sb1.append(" guzel insan")); // faruk efehan guzel insan
		System.out.println("sb1 son halin kapasitesi : " + sb1.capacity()); // 34

		// default capacity is 16
		// fazladan ayrilan kapasiteyi silme --> obj.trimToSize();
		sb1.trimToSize();
		System.out.println("sb1 kapasite düzenlenmis : " + sb1.capacity()); // 24
		// istenen karakterin indexini alin --> obj.indexOf();
		System.out.println("sb1 in e karakerin indexi : " + sb1.indexOf("e")); // 6
		System.out.println("sb1 in e karakterinin son indexi : " + sb1.lastIndexOf("e")); // 16

		// istenen bir karakterin indexine gore alma
		System.out.println("sb1 7 indexteki karakter : " + sb1.charAt(7)); // f

		// belirli bir araliktaki karakteri alma
		System.out.println("belirli araliktaki karakteri alma (7,12) : " + sb1.subSequence(7, 12)); // fehan
		System.out.println("sb1 nin 5 dahil tum karakterleri : " + sb1.toString().substring(5)); // efehan guzel insan
		System.out.println("sb1 nin 5 dahil tum karakterleri : " + sb1.subSequence(5, sb1.length())); // efehan guzel
																										// insan

		// sb1 deki belli bir index deki karakteri silme --> obj.delete();
		System.out.println("(3,7) arasindaki karakterlerin silinmis hali : " + sb1.delete(3, 7));
		System.out.println("(2) indexteki karakterin silinmis hali : " + sb1.deleteCharAt(2));

		// istenen indexte istenen karakteri ve karakterleri eklemek
		System.out.println("2. indexe r eklenmis hali : " + sb1.insert(2, "r"));
		System.out.println("7. indexe pi sayisini eklemek : " + sb1.insert(7, 3.14));

		int[] arr = { 17, 63, 21 };
		sb1.insert(9, Arrays.toString(arr)); // sb1 'in 9. indexteki karakterinden itibaren arr verileri eklendi
		System.out.println("sb1 e arr eklenmis hali : " + sb1);

		// istenen indexteki karakterin yerine birden fazla karakter eklemek -->
		// obj.replace(a,b,"karakterler");
		StringBuilder sb2 = new StringBuilder("Bugun hava cook sýcak");
		System.out.println(sb2); // Bugun hava cook sýcak
		sb2.replace(3, 10, "x");
		// atanacak string kisa ama index uzun olunca kalan indexteki karakterleri siler
		System.out.println("sb2'nin son hali : " + sb2); // Bugx cook sýcak

		System.out.println("ozel durum : " + sb2.insert(5, "basarili", 2, 4)); // Bugx sacook sýcak
		/*
		 * 5: sb2'ye "basarili" ekleme baslangic indexi basarili:eklenecek string
		 * 2:eklenecek stringin baslangic indexi (bu dahil) 4:eklenecek stringin bitis
		 * indexi (bu haric olucak)
		 */
		// reverse methodu --> obj.reverse(); sb elemanlari indexe gore ters cevirir.
		StringBuilder sb3 = new StringBuilder("Bugun hava cok sýcak");
		sb3.reverse();
		System.out.println("sb3 ters cevrilmis hali: " + sb3);

		// String ile StringBuilder karsilastirmasi: == equals -->
		// SB de equals methodu string classindan farkli calisir. String classindaki ==
		// operatoru ile
		// ayný islemi yapar... Hem icerik hemde referans esitligine bakar.

		String s = "hayat";
		StringBuilder sb = new StringBuilder("hayat");
		// System.out.println(s==sb); --> farkli data type lari karsilastirma operator
		// derleyemez. CTE verir.
		System.out.println(s.equals(sb)); // false (different references)
		System.out.println(s.equals(sb.toString())); // true (Stringe cevirdigimiz icin equals methodu sadece icerige
														// bakar)

		// StringBuilder index parametreli appent: farkli string den parca ekleme -->
		
		System.out.println(sb.toString().concat("guzel")); 
		System.out.println(sb); // bir yukarisinida atama olmadigi icin sb ayni kalir
		System.out.println(sb.append(s,2,5)); // sb ye s nin 2 ile 5 arasini ekle

	}

}
