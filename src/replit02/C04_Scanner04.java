package replit02;

import java.util.Scanner;

public class C04_Scanner04 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n� sorun.
		 * Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.
		 * 
		 * 1 �eker = 1.7 gr
		 * 
		 * �rnek ��kt�:
		 * 
		 * Y�lda 12.41 kg �eker kullan�yor.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Gunde ne kadar cay iciyorsunuz : ");
		int icilenCayNum = scan.nextInt();
		System.out.print("ne kadar seker kullan�yorsunuz : ");
		int sekerNum = scan.nextInt();

		double yildaSekerKullanim = ((icilenCayNum * (sekerNum * 0.0017))*365); 
		System.out.println("Y�lda " + yildaSekerKullanim + " kg �eker kullan�yor.");
		scan.close();
	}

}
