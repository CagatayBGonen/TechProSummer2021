package day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		
		// kullanicadan ismini alip isminin bas harfini yazdirin.
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		char firstLetter=scan.next().charAt(0);
		
		//  mehmet = 6 harf 
		/* 1. harf = index 0
		   2. harf = index 1
		   3. harf = index 2
		 */
		
		System.out.println("girdiginiz kelimenin ilk harfi : " + firstLetter);
		
		scan.close();
		
	}

}
