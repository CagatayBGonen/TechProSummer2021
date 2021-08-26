package day02_variables_scanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		//farkli 3 data turunde variable olsuturun ve bunlari yazdirin
		
		String str = "Merhaba"; // satir sonunda mutlaka ; kullanilmalidir.
		
		System.out.println(str);
		
		System.out.println("str"); // str yazdirir
		
		
		int sayi = 20;
		
		System.out.println(sayi);
		
		// yazdirirken basina aciklama eklemek istersem
		// girilen sayi : 20
		// eger degisken ve aciklamayi birlikte yazdirkmak istersek
		// " aciklama " + variableIsmi
		
		System.out.println("girilen sayi : " + sayi);
		
		
		boolean tatildeMi = true ;
		
		System.out.println( tatildeMi );
		
		
		// konsolda bu sene tatile gittiniz mi ? = true
		// variable olmayan kisim : "bu sene tatile gittiniz mi ? = "
		// variabledan gelen kisim : true
		
		
		System.out.println("bu sene tatile gittiniz mi ? = " + tatildeMi);
		
		/*
		 2- isim ve soyisim icin iki variable olsuturun ve bunlari
		         isminiz : mehmet
		         soyisim : Bulutluoz
		         seklinde yazdirin
		         
		 */
		
		String name = "Cagatay";
		String surname = "Gonen";
		
		System.out.println("isminiz : " + name);
		System.out.println("soyisminiz : " + surname);
		
		
		// iki farkli tamsayi data turunde 2 variable olusturun
		// bunlarin toplamini yazdirin
		
		int sayi1 = 10;
		byte sayi2 = 5;
		
		System.out.println( sayi1 + sayi2 );
		
		
		// toplama isleminin basina aciklama yazmak istersek
		
		// iki sayinin toplamý = 15
		
		System.out.println("iki sayinin toplami = " + (sayi1 + sayi2));
		
		// String ve sayisal islemleri birlikte yaptirdigimizda 
		// matematiksel islem parantez icine alin
		
		
		// Bir tamsayi ve bir ondalikli variable olsuturun ve bunlarin toplamini yazdirin
		
		int sayi3 = 15 ;
		double sayi4 = 3.14 ;
		
		System.out.println(sayi3 + sayi4);
				
		// toplam : 18.14
		
		System.out.println("toplam : " + (sayi3 + sayi4));
		
		
		// char data turunde bir variable olusturun ve yazdirin
		
		char karakter= '?';
		
		System.out.println(karakter);
		System.out.println("Girilen karakter : " + karakter);
		
		
		// bir tamsayi, bir de char degisken olsuturun ve bunlarin toplamini yazdirin.
		
		int sayi5= 20;
		char harf= 'M';
		
		System.out.println(sayi5 + harf); //20M neden gelmedi?
		
		// char data turundeki degiskenler matematiksel degiskenlerde kullanilirsa
		// ASCII tablosu devreye girer
		// Java o karakter yerine ASCII tablosundaki degeri kullanir.
		// bir sonraki derste degistirmenin yolunun ogrenicez.		
		

	}

}
