package day08_ternary_operator;

import java.util.Scanner;

public class C6_Nested_Ternary01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 100’den
		 * kucukse “iki basamakli sayi” degilse “uc basamakli veya daha buyuk sayi”
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen bir tamsayi giriniz : ");

		int num = scan.nextInt();
		
		System.out.println(num<10 ? "Rakam":num<100?"iki basamakli sayi":"uc basamakli ve ya daha buyuk sayi");
		
		scan.close();
		

	}

}
