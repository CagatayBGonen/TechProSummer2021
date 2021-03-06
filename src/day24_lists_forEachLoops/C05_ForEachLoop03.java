package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop03 {

	public static void main(String[] args) {
		/*
		 * Soru 3:
		 * 
		 * iki String array olusturunuz ve bu array?lerdeki ortak elemanlari For-each
		 * loop kullanarak bulunuz.
		 * 
		 * Sonucu ekrana yazdiriniz.
		 * 
		 * Ortak eleman yoksa ekrana ?Ortak eleman yok? yazdiriniz
		 */
		
		String arr1[]= {"A","b","C","d"};
		String arr2[]= {"A","z","W","d","E"};
		List<String> shared = new ArrayList<>();
		
		for (String each1 : arr1) {
			for (String each2 : arr2) {
				
				if (each1.equals(each2)) {
					shared.add(each1);
				}
			}
		}
		if (shared.isEmpty()) {
			System.out.println("Ortak eleman yok");
		} else {
			System.out.println(shared);
		}

	}

}
