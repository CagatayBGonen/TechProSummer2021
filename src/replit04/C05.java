package replit04;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		/*
		 * Bir aydaki gün sayýsýný hesaplayan bir Java programý yazýnýz.
		 * 
		 * INPUT:
		 * 
		 * Ay Numarasi:
		 * 
		 * 2
		 * 
		 * Yil :
		 * 
		 * 2016
		 * 
		 * OUTPUT :
		 * 
		 * Subat 2016 29 Gundur.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("ay giriniz : ");
		int ay = scan.nextInt();
		System.out.print("yil giriniz : ");
		int yil = scan.nextInt();

		int gunSayisi = 0;
		String ayAdi = "";

		switch (ay) {
		case 1:
			ayAdi = "Ocak";
			gunSayisi = 31;
			break;
		case 2:
			ayAdi = "Subat";
			if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0))) {
				gunSayisi = 29;
			} else {
				gunSayisi = 28;
			}
			break;
		case 3:
			ayAdi = "March";
			gunSayisi = 31;
			break;
		case 4:
			ayAdi = "April";
			gunSayisi = 30;
			break;
		case 5:
			ayAdi = "May";
			gunSayisi = 31;
			break;
		case 6:
			ayAdi = "June";
			gunSayisi = 30;
			break;
		case 7:
			ayAdi = "July";
			gunSayisi = 31;
			break;
		case 8:
			ayAdi = "August";
			gunSayisi = 31;
			break;
		case 9:
			ayAdi = "September";
			gunSayisi = 30;
			break;
		case 10:
			ayAdi = "October";
			gunSayisi = 31;
			break;
		case 11:
			ayAdi = "November";
			gunSayisi = 30;
			break;
		case 12:
			ayAdi = "December";
			gunSayisi = 31;
		}
		System.out.print(ayAdi + " " + yil + " " + gunSayisi + " Gundur.");
		scan.close();

	}

}
