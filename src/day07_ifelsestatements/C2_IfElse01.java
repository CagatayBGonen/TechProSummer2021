package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		// ve dikdortgenin kare olupolmadigini yazdirin
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen dikdortgenin kenarlarini yaziniz \nilk kenari yazinca enter'a basiniz");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1 == kenar2) {
			System.out.println("Girdiginiz dikdortgen karedir");
		} else {
			System.out.println("Girdiginiz diktorgen kare degildir");
		}
		scan.close();
	}

}
