package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		/*
		 * SOru3: Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu
		 * yazdirin Ornek: gun= pazar output= "hafta sonu" gun= sali output= "haftaici"
		 **** String icin equals method'unu kullanin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gun ismini giriniz ...");
		String dayName = scan.next().toLowerCase();

		// bayrak kullanimi (flag)
		int flag = 0;

		if (dayName.equals("pazartesi") || dayName.equals("sali") || dayName.equals("carsamba")
				|| dayName.equals("persembe") || dayName.equals("cuma")) {
			System.out.println("girdigniz gun haftaici");
			flag++;
		}
		if (dayName.equals("cumartesi") || dayName.equals("pazar")) {
			System.out.println("girdiginiz gun hafta sonu");
			flag++;
		}
		if (flag == 0) {
			System.out.println("lutfen gecerli bir gun giriniz");
		}
		scan.close();

	}

}
