package day07_ifelsestatements;

import java.util.Scanner;

public class C9_NestedIfElse02 {

	public static void main(String[] args) {
		/*
		 * Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		 * 
		 * Kullanicidan bir sifre girmesini isteyin Eger ilk harf buyuk harf ise “A”
		 * olup olmadigini kontrol edin. Ilk harf A ise “Gecerli Sifre” degilse
		 * “Gecersiz Sifre” yazdirin. Eger ilk harf kucuk harf ise “z” olup olmadigini
		 * kontrol edin. Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre”
		 * yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sifre giriniz ...");
		char passwordFirstLetter = scan.next().charAt(0);

		if (passwordFirstLetter >= 'a' && passwordFirstLetter <= 'z') { // kucuk harf
			if (passwordFirstLetter == 'z') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
		} else if (passwordFirstLetter >= 'A' && passwordFirstLetter <= 'Z') { // buyuk harf
			if (passwordFirstLetter == 'A') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
		} else { // yanlis giris
			System.out.println("sifrenin ilk karakteri harf olmali");
		}
		scan.close();

	}

}
