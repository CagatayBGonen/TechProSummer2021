package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
		 * olmadigini yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz ...");
		char character = scan.next().charAt(0);

		if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
			System.out.println("Girdigniz karacter harftir");

		} else {
			System.out.println("Girdigniz karakter harf degildir");
		}
		scan.close();
	}

}
