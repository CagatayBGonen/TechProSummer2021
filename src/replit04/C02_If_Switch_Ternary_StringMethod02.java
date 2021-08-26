package replit04;

import java.util.Scanner;
public class C02_If_Switch_Ternary_StringMethod02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J*** W****
		 * 
		 * CCN : **** **** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("adiniz : ");
		String name = scan.nextLine().toLowerCase();
		System.out.print("soyadiniz : ");
		String surname = scan.nextLine().toLowerCase();
		System.out.print("kredi karti no : ");
		String ccn = scan.next().trim();
//		String name = "john";
//	    String surname = "white";
//	    String ccn = "1234234534561478";
		
		String editedName = name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\w", "*");
		String editedSurname = surname.substring(0, 1).toUpperCase() + surname.substring(1).replaceAll("\\w", "*");
		String editedCCN = "**** **** **** " + ccn.substring(12);
		System.out.println("Name : " + editedName + " " + editedSurname + "\nCCN : " + editedCCN);
		scan.close();
	}

}
