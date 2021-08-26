package day31_varags_stringBuilder;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
public class C03_Varags03 {

	public static void main(String[] args) {
//		 verilen int lerden ilki haric tum sayilari toplayan
//		 ve buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.
		topla(2,5,55,21,33);
	}
	public static void topla(int carpilacakSayi, int... toplanacaklar) {
		var toplam = 0;
		for (int w: toplanacaklar) {
			toplam += w;
		}
		System.out.println("sonuc : " + (carpilacakSayi*toplam));
	}
		
		
		
		
		
//		
//		Scanner scan = new Scanner(System.in);
//		List<Integer> numList = new ArrayList<>();
//		do {
//			System.out.println("sayi giriniz : " + "\nbitirmek icin -1 yaziniz");
//			numList.add(scan.nextInt());						
//		}while(!numList.contains(-1));
//		System.out.println(numList.remove(numList.indexOf(-1)));
//		System.out.println(numList);
//		Integer[] sayiList = new Integer[numList.size()];
//		sayiList = numList.toArray(sayiList);
//		
//		islem(sayiList);
//		scan.close();
//		
//	}
//
//	public static void islem(Integer[] multiply, int...sum) {
//		var toplam = 0;
//		for(int w: sum) {
//			toplam+=w;
//		}
//		System.out.println(toplam*multiply);				
//	}		
}
