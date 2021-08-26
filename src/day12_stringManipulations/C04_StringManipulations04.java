package day12_stringManipulations;

import java.util.Scanner;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		// Soru 5) Kullanicidan 4 harfli bir kelime isteyin 
		//4 harften uzun veya kisa ise "lutfen 4 harfli bir kelime girin Yazdirin"
		//doðru ise girilen kelimeyi tersten yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen 4 harfli bir kelime yaziniz : ");
		String word = scan.next();
		
		if (word.length()!=4) {
			System.out.println("Lutfen 4 harfli bir kelime girin");
		} else {
			System.out.println(word.substring(3, 4) + word.substring(2, 3) + word.substring(1, 2) + word.substring(0, 1));
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
