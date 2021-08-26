package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElseIf01 {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		// eger uzunluklardan birisi 0 veya daha kucukse
		// "gecerli uzunluk giriniz" yazdirin
		// uzunluklarýn ikisi de pozitif ise
		// dikdortgenin kare olup olmadigini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin kenarlarini yaziniz \nilk kenari yazinca enter'a basiniz");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();

		if (kenar1 <= 0 || kenar2 <= 0) {
			System.out.println("Lutfen gecerli bir uzunluk giriniz");
		} else if (kenar1 == kenar2) {
			System.out.println("karedir");
		} else {
			System.out.println("kare degildir");
		}
		scan.close();
	}

}
