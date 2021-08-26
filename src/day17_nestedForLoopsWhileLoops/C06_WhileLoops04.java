package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoops04 {

	public static void main(String[] args) {
		/*
		 Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("bir sayi giriniz : ");
		int num = scan.nextInt();
		int i = num;
		int sum = 0;
		int figure = 0;
		while (i>0) {
			figure = i%10;
			sum += figure;
			i /= 10;
		}
		System.out.println("girdiginiz " + num + " sayisinin rakamlar toplami " + sum + "'dir.");
		scan.close(); 
	}

}
