package day32_stringBuilder_accessModifier;

import java.time.LocalTime;

public class C02_StringBuilder02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 1000 kere donecek bir loop yazalim
		// loop'da String ve StringBuilder kullanip
		// oncesinde ve sonrasinda zaman alalim
		// hizlarini karsilastiralim
		String str = "Husco";
		LocalTime stringTime1 = LocalTime.now();
		System.out.println("String baslangic zamani: " + stringTime1);
		for(var i = 1; i<=1000; i++) {
			str = "helal sana be Husco";
		}
		LocalTime stringTime2 = LocalTime.now();
		System.out.println("String bitis zamani: " + stringTime2);
		StringBuilder sb1 = new StringBuilder("Husco");
		LocalTime stringTime3 = LocalTime.now();
		System.out.println("StringBuilder baslangic zamani: " + stringTime3);
		for(var i = 1; i <= 1000; i++) {
			sb1.append("helal sana be Husco");
		}
		LocalTime stringTime4 = LocalTime.now();
		System.out.println("StringBuilder bitis zamani: " + stringTime4);
		System.out.println("String fark: " + stringTime2.compareTo(stringTime1));
		System.out.println("StringBuilder fark: " + stringTime4.compareTo(stringTime3));
		//---------------------------------------------------
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		//---------------------------------------------------
//		String s1 = "Java";
//		StringBuilder s2 = new StringBuilder("Java");
//		if(s1==s2) { -------> compile time error (CTE) verir. String ve StringBuilder karsilastirilamazlar.
//			
//		} else {
//			
//		}
		
		
	}

}
