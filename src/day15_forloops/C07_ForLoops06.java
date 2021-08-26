package day15_forloops;

import java.util.Scanner;

public class C07_ForLoops06 {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen bir String yaziniz : ");
		String str = scan.next();
		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.substring(str.length()-1-i, str.length()-1-i+1));
		}
		scan.close();
	}

}
