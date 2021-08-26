package day09_practice01;

import java.util.Scanner;

public class C07_Practice07 {

	public static void main(String[] args) {
		// Kullanici tarafindan girilen bir sayinin
		// mutlak degerini yazdirmak icin bir program yaziniz.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		double num = scan.nextDouble();
		 if (num<0) {
			num *= (-1);
		} else {
			num *= 1;
		}
		System.out.println("Sayimizin mutlak degeri : " + num);
		
		scan.close();
	}

}
