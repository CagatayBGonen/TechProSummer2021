package day08_practice01;

import java.util.Scanner;

public class C6_Scanner04 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki
		 * rakamlari toplamini bulunuz
		 * 
		 * Ex : input : 12345 output : 12
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen 5 basamakli bir tamsayi giriniz : ");
		int num = scan.nextInt();
		int birler = num % 10;
		int onlar = num / 10 % 10;
		int binler = num / 1000 % 10;
		int onbinler = num / 10000;
		int ilk2 = onbinler + binler;
		int son2 = birler + onlar;
		System.out.println("ilk 2 basamaginadaki rakamlarin toplami : " + ilk2
				+ "\nson iki basamagindaki rakamlarin toplami : " + son2 + "\nSon toplam : " + (ilk2 + son2));
		scan.close();
	}

}
