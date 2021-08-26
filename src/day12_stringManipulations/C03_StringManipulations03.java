package day12_stringManipulations;

import java.util.Scanner;

public class C03_StringManipulations03 {

	public static void main(String[] args) {
		/*
		 * Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
		 * sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem
		 * basarisiz,Lutfen yeni bir sifre girin” yazdirin - Ilk harf buyuk harf olmali
		 * - Son harf kucuk harf olmali - Sifre bosluk icermemeli - Sifre uzunlugu en az
		 * 8 karakter olmali
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen sifrenizi giriniz");
		String password = scan.nextLine();
		
		boolean firstLetterControl = password.charAt(0)>='A' && password.charAt(0)<='Z';
		boolean lastLetterControl = password.charAt(password.length()-1)>='a'&& password.charAt(password.length()-1)<='z';
		boolean spaceControl = !password.contains(" "); // ! iþareti tersine iþaret ediyor. bosluk yoksa tru oluyor bu durumda.
		boolean passwordLenght = password.length()>=8;
		
		if (firstLetterControl && lastLetterControl && spaceControl && passwordLenght) {
			System.out.println("Sifre basari ile tanimlandi");
		}else {
			System.out.println("Islem basarisiz, lutfen yeni bir sifre girin");
		}
		scan.close();
		
	}

}
