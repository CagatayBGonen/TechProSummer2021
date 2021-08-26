package day08_ternary_operator;

import java.util.Scanner;

public class C5_Ternary03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen bir sayi giriniz : ");

		double num = scan.nextDouble();

		System.out.println(num > 0 ? num : -1 * num);

		scan.close();

	}

}
