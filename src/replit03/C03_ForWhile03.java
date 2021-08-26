package replit03;

import java.util.Scanner;

public class C03_ForWhile03 {

	public static void main(String[] args) {
		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazýniz.(mülakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bir str yaziniz : ");
		String str = scan.nextLine().toLowerCase().trim();
		System.out.print("Output: ");
		for (char i = 'a'; i <= 'z'; i++) {
			if (str.indexOf(i) != str.lastIndexOf(i)) {
				System.out.print(i + " ");
			}
		}

		scan.close();
	}

}
