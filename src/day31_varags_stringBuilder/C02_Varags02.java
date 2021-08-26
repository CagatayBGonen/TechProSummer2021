package day31_varags_stringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Varags02 {

	public static void main(String[] args) {
		// Varags kullanarak verilen Stringleri birlestiren concat isimli bir method
		// olusturunuz

		Scanner scan = new Scanner(System.in);
		List<String> kelimeList = new ArrayList<>();
		do {
			System.out.println("bir kelime giriniz (isiniz bitince \"bitti\" yaziniz)");
			kelimeList.add(scan.next());
		} while (!kelimeList.contains("bitti"));
		kelimeList.remove("bitti");
		String[] wordList = new String[kelimeList.size()];
		wordList = kelimeList.toArray(wordList);
		System.out.println(concat(wordList));
		scan.close();
	}

	private static String concat(String... kelimeList) {
		var birlesim = "";
		for (String each : kelimeList) {
			// birlesim += each+" ";
			birlesim = birlesim.concat(each);
		}

		return birlesim;
	}

}
