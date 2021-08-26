package replit03;

import java.util.Scanner;

public class C02_ForWhile02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti:
		 * 
		 * 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("1. tamsayi : ");
		int num1 = scan.nextInt();
		System.out.print("2. tamsayi : ");
		int num2 = scan.nextInt();

		int gcd = 1;
		int lcm = 1;
		
		for (int i=1 ; i<=num1 && i<=num2 ; i++) {
			if (num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
			
			
			}
				
		lcm = num1*num2/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		scan.close();

	}

}
