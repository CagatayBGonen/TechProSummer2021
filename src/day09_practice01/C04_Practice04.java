package day09_practice01;

import java.util.Scanner;

public class C04_Practice04 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
		 * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
		 * durumunu da kontrol edniz
		 * 
		 * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi
		 * iki kenar farký diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c b+c>a>b-c
		 * a=b=c ise es kenar ucgen
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir tamsayi giriniz : ");
		int a = scan.nextInt();
		System.out.print("Lutfen bir tamsayi giriniz : ");
		int b = scan.nextInt();
		System.out.print("Lutfen bir tamsayi giriniz : ");
		int c = scan.nextInt();

		if (a + b > c && c > a - b && a + c > b && b > a - c && b + c > a && a > b - c) {
			if (a == b && b == c) {
				System.out.println("ucgen eskenar");
			} else {
				System.out.println("normal ucgen");
			}

		} else {
			System.out.println("ucgen olusmaz");
		}
		scan.close();
	}

}
