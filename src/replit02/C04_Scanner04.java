package replit02;

import java.util.Scanner;

public class C04_Scanner04 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný sorun.
		 * Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.
		 * 
		 * 1 þeker = 1.7 gr
		 * 
		 * Örnek Çýktý:
		 * 
		 * Yýlda 12.41 kg þeker kullanýyor.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Gunde ne kadar cay iciyorsunuz : ");
		int icilenCayNum = scan.nextInt();
		System.out.print("ne kadar seker kullanýyorsunuz : ");
		int sekerNum = scan.nextInt();

		double yildaSekerKullanim = ((icilenCayNum * (sekerNum * 0.0017))*365); 
		System.out.println("Yýlda " + yildaSekerKullanim + " kg þeker kullanýyor.");
		scan.close();
	}

}
