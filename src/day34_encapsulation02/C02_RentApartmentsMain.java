package day34_encapsulation02;

import java.util.Scanner;

public class C02_RentApartmentsMain {
//    Burada iki adet class vard�r. Biri Main di�eri ise rentApartments
//    rentApartments'�n i�inde;
//    Bu variable'lar� private olarak olu�turun;
//    String name
//    int roomCount
//    boolean balconyOrNo
//   B�t�n variable'lar i�in getter ve setter olu�turunuz.
//    4 farkl� Apartment(apartman dairesi) vard�r. 0, 1, 2, 3 rooms(odal�)
//    -----------------------------------------------------------------
//    Bir method olu�turun;
//    E�er room say�s� 0 ise,
//    rent(kira) 1400
//    E�er oda say�s� 1 ise,
//    rent  1700
//    E�er oda say�s� 2 ise,
//    rent 2200
//    E�er oda say�s� 3 ise,
//    rent 2700
//    rent'i return'leyin.
//    ----------------------------------------------------------------
//    Bir method olu�turun.
//    E�er balconyOrNo  true ise,
//    rent'e 200 dollar ekleyin.
//    Main class'�n i�inde;
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
