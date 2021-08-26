package replit03;

import java.util.Scanner;

public class C04_ForWhile04 {

	public static void main(String[] args) {
		/*
		 * Girdi olarak bir tamsayý kabul eden ve faktöriyel hesaplayan programi
		 * yazýniz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=6*5*4*3*2*1=720
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bir tamsayi yaziniz : ");
		int num = scan.nextInt();
		int fak = 1;
		
		System.out.print(num + "!=");
		for (int i = num; i > 0; i--) {
			fak *= i;
			System.out.print(i);
			if (i > 1) {
				System.out.print("*");
			}
		}
		System.out.print("=" + fak);
		
		
//      for (int i = 1; i <= num; i++) {
//			fak *= i;
//
//		}
//
//		System.out.print(num + "!=");
//		for (int i = num; i > 0; i--) {
//			System.out.print(i);
//			if (i > 1) {
//				System.out.print("*");
//			}
//		}
//		System.out.println("=" + fak);
		scan.close();
	}

}
