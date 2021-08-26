package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {
		// SOru3: Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu
		// yazdirin Ornek: gun= pazar output= "hafta sonu" gun= sali output= "haftaici"
		// **** String icin equals method'unu kullanin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gun ismini giriniz ...");
		String dayName = scan.next().toLowerCase();

		if (dayName.equals("pazartesi") || dayName.equals("sali") || dayName.equals("carsamba")
				|| dayName.equals("persembe") || dayName.equals("cuma")) {
			System.out.println("girdiginiz gun haftaici");
		} else if (dayName.equals("cumartesi") || dayName.equals("pazar")) {
			System.out.println("girdiginiz gun hafta sonu");
		} else {
			System.out.println("Lutfen gecerli bir gun ismi giriniz");
		}
		scan.close();

	}

}
