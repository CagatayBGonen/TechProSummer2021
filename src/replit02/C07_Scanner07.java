package replit02;

import java.util.Scanner;

public class C07_Scanner07 {

	public static void main(String[] args) {
		// Kullan�c� taraf�ndan girilen DOUBLE say�y� tam say�ya �eviren bir program yaz�n�z.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Double bir sayi giriniz : ");
		double a = scan.nextDouble();
		int b = (int)a;
		System.out.println(b);
		scan.close();

	}

}
