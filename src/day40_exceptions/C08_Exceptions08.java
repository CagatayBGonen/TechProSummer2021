package day40_exceptions;

public class C08_Exceptions08 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int sayi = 34;
		
		String str1 = "1453";
		
	//	String str2 = sayi; // (CTE)(checked)
		
		int okulNo = Integer.parseInt(str1);
		
		System.out.println("okul no: "+okulNo);
		System.out.println(str1+35); // 145335
		System.out.println(okulNo+35);// 1488
		
		
		String str2 = "14a3";
		
	//	int strSayi = Integer.parseInt(str2);// NumberFormatException (unchecked)(RTE)
		
		Object sayi2 = 45; // object data type tum classlarin parent'ti.
		
	//	String strSayi2=(String)sayi2; // data Type Class casting buyuk veri kucuk kont atandi.
		// ClassCastException unchecked verir.
		// data turlerini casting yaparken uygun olmayan islem
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
