package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C01_NestedForLoops01 {

	public static void main(String[] args) {
		/*
		 * Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
			asagidaki sekli cizdirin
		 	*
		 	* *
		 	* * *
		 	* * * *
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen pozitif bir rakam giriniz : ");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); 
				
			}
			System.out.println("");
		}
		scan.close();

	}

}
