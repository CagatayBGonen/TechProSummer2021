package day10_stringmanipulations;

public class C02_StringManipulation02 {

	public static void main(String[] args) {
		
		String str = "Java guzeldir";
		
		System.out.println(str.length()); // 13
		
		
		String str2 = "";
		
		System.out.println(str2.length()); // 0
		
		// str2 = null;
		
		// System.out.println(str2.length()); // error
		
		// str'in son harfinin index'i nedir ?
		// str'in uzunlugunun 13
		// son harfin index'i 12
		
		String str3 = "fkiþlasiþlasiþlasiþlasiþlasiþlasdfkfksfksiþafkilas";
		
		// Str3'un son harfinin index'i : str.length()-1
		
		System.out.println(str3.length()-1); // 49
		
		
		
		
		
		
	}

}
