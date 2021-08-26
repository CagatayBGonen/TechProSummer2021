package day40_exceptions;

import java.util.Scanner;

public class Soru02 {
	/*
	 * String str[],Urun isimlerini tuttugumuz bir Array olsun. Kullanicidan
	 * istedigi urunun sirasini isteyin ve istedigi urunu yazdirin. Kullanici
	 * Array’de olan urun sayisindan buyuk bir sira no girerse “Girdiginiz sira urun
	 * sayisindan buyuk” yazdirin.
	 */
	public static void main(String[] args) {
		String[] str= {"Dell","Mac","Lenovo","HP","Asus"};
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<6;i++ ) {
			
			System.out.println(i + ")- " + str[i-1]);
		}
	
		System.out.print("hangi urunu istiyorsunuz(Urun no): ");
		int urunNo=Integer.parseInt(scan.nextLine());
		try {
			System.out.println(str[urunNo-1]);
		}catch(Exception e) {
			System.out.println("Girdiginiz sira urun sayisindan buyuk");
		}
		scan.close();
	}
}
