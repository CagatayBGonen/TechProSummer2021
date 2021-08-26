package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse03 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya yasini sorun, eger yas 65’e esit veya kucuk ise “emekli
		 * olamazsin, calismalisin”, 65’den buyukse “Emekli olabilirsin” yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int age = scan.nextInt();

		if (age <= 65) {
			System.out.println("Emekli olamazsin, calismalisin");
		} else {
			System.out.println("Emekli olabilirsiniz");
		}
		scan.close();

	}

}
