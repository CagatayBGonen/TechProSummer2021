package day06_relational_operators_ifstatement;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {
		 
		// kullanicidan bir tamsayi isteyin ve sayinin tek ve cift oldugunu yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir sayi giriniz");
		
		int girilensayi= scan.nextInt();
		
		if (girilensayi%2==0) {
			System.out.println("girdigniz sayi cift sayi");
			
		}
		if (girilensayi%2==1) {
			System.out.println("girdiginiz sayi tek sayi");
		}
		if (girilensayi<0) {
			System.out.println("lutfen pozitif bir tamsayi girin");
		}
		scan.close();
	}

}
