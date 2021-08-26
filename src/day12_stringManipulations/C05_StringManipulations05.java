package day12_stringManipulations;

public class C05_StringManipulations05 {

	public static void main(String[] args) {
		// Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		// String str1 = “$13.99”
		//		 String str2 = “$10.55”
		//		 ipucu : Double.parseDouble() methodunu kullanabilirsiniz
		
		String str1 = "$13.99";
		String str2 = "$10.55";
		str1 = str1.replace("$", "");
		str2 = str2.replace("$", "");
		Double val1 = Double.parseDouble(str1);
		Double val2 = Double.parseDouble(str2);
		
		System.out.println("iki sayinin toplami : $" + (val1 + val2));
		
		
		

	}

}
