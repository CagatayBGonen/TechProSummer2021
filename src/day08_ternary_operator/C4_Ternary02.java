package day08_ternary_operator;

import java.util.Scanner;

public class C4_Ternary02 {

	public static void main(String[] args) {
		// soru 1)
		// kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir tamsayi giriniz : ");

		double num1 = scan.nextInt();

		System.out.print("Lutfen bir tamsayi daha giriniz : ");

		double num2 = scan.nextInt();

		double num3 = num1 > num2 ? num2 : num1;

		System.out.println("Buyuk olmayan sayi : " + num3);

		scan.close();
	}

}
