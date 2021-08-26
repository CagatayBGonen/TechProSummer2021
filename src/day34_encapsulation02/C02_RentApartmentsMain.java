package day34_encapsulation02;

import java.util.Scanner;

public class C02_RentApartmentsMain {
//    Burada iki adet class vardýr. Biri Main diðeri ise rentApartments
//    rentApartments'ýn içinde;
//    Bu variable'larý private olarak oluþturun;
//    String name
//    int roomCount
//    boolean balconyOrNo
//   Bütün variable'lar için getter ve setter oluþturunuz.
//    4 farklý Apartment(apartman dairesi) vardýr. 0, 1, 2, 3 rooms(odalý)
//    -----------------------------------------------------------------
//    Bir method oluþturun;
//    Eðer room sayýsý 0 ise,
//    rent(kira) 1400
//    Eðer oda sayýsý 1 ise,
//    rent  1700
//    Eðer oda sayýsý 2 ise,
//    rent 2200
//    Eðer oda sayýsý 3 ise,
//    rent 2700
//    rent'i return'leyin.
//    ----------------------------------------------------------------
//    Bir method oluþturun.
//    Eðer balconyOrNo  true ise,
//    rent'e 200 dollar ekleyin.
//    Main class'ýn içinde;
//    userName rent is amountOfRent
     
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("adiniz: ");
		String name = scan.nextLine();
		System.out.print("oda sayisi: ");
		int roomCount = scan.nextInt();
		System.out.print("balkon? ");
		boolean balconyOrNo = scan.nextBoolean();
		
		C01_RentApartments kiraci = new C01_RentApartments(); 
		kiraci.setName(name);
		kiraci.setRoomCount(roomCount);
		kiraci.setBalconyOrNo(balconyOrNo);
		
		int toplamKira = kiraci.balconyOrNo(balconyOrNo) + kiraci.kiraHesapla(roomCount);
		System.out.println(kiraci.getName() + " adli kullanicinin kirasi " + toplamKira);
		
		
		
		scan.close();
	}

}
