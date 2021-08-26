package day06_relational_operators_ifstatement;

import java.util.Scanner;

public class C6_IfStatements05 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
		 * Ornek: gun= pazar output= "hafta sonu" gun= sali output= "haftaici"
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gun ismi giriniz");
		String dayName = scan.next().toLowerCase();

		// bayrak kullanimi (flag)
		int flag = 0;

		if (dayName.equals("pazartesi") || dayName.equals("sali") || dayName.equals("carsamba")
				|| dayName.equals("persembe") || dayName.equals("cuma")) {
			System.out.println("haftaici");
		}
		if (dayName.equals("cumartesi") || dayName.equals("pazar")) {
			System.out.println("hafta sonu");
		}
		if (flag == 0) {
			System.out.println("lutfen gecerli bir gun ismi giriniz");
		}
		scan.close();
	}

}
