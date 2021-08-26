package replit02;

import java.util.Scanner;

public class C06_Scanner06 {

	public static void main(String[] args) {
		//Kullanýcýdan bir Float deðer girmesini isteyin, bu sayýyý short deðiþken tipine dönüþtürün ve konsolda yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Float bir deger giriniz : ");
		float a = scan.nextFloat();
		short b = (short)a;
		System.out.println(b);
		scan.close();
		
		

	}

}
