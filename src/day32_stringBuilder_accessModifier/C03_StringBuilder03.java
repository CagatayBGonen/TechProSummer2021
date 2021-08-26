package day32_stringBuilder_accessModifier;

import java.util.Scanner;

public class C03_StringBuilder03 {

	public static void main(String[] args) {
		/*
		 * Bir cümleyi parametrre olarak kabul eden, StringBuilder kullanarak ters ceviren 
		 * ve cumlenin palindrome olup olmadigini kontrol eden (buyuk/Kucuk duyarliligi olmadan) bir java programi yazin.
		 * ex: input: I love Java
		 * Output: "Reversed Sentence: avaJ evol I. It is not a palindrome"
		 */
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("Bir cumle yaziniz : ");
		StringBuilder sb = new StringBuilder (scan.nextLine());
		String palCheck = "";
		if(sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
			palCheck = "It is a palindrome";
			System.out.println("Input: " + sb + "\nOutput: " + sb.reverse() + ". " + palCheck);
		} else {
			palCheck = "It is not a palindrome";
			System.out.println("Input: " + sb + "\nOutput: " + sb.reverse() + ". " + palCheck);
		}
		scan.close();
	}

}
