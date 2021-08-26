package day05_wrapper_concatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {

		int num = 7;
		char firstLetter = 'a';
		String str = "Java";

		System.out.println(num + str + firstLetter); // 7Javaa
		System.out.println(num + firstLetter + str); // 104Java

	}

}
