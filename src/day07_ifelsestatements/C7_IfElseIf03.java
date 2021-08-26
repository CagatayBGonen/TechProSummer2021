package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf03 {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin.
		// Not’u harf sistemine cevirip yazdirin.
		// 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");
		double grade = scan.nextDouble();

		if (grade < 0 || grade > 100) {
			System.out.println("Lutfen gecerli bir not giriniz");
		} else if (grade < 50) {
			System.out.println("D");
		} else if (grade <= 60) {
			System.out.println("C");
		} else if (grade <= 80) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		scan.close();
	}

}
