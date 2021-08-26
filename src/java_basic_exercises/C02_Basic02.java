package java_basic_exercises;
import java.util.Scanner;
public class C02_Basic02 {

	public static void main(String[] args) {
		/*
		 * 2. Write a Java program to print the sum of two numbers.
		 * 
		 * Test Data: 74 + 36
		 * 
		 * Expected Output : 110
		 */
		int num1 = 74;
		int num2 = 36;
		System.out.println(num1 + num2); // 110
		
		int num3 = 74;
		num3 += 36;
		System.out.println(num3); // 110
		
		int num4 = 74;
		int num5 = num4 + 36;
		System.out.println(num5); // 110
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1.sayi : ");
		int sayi1 = scan.nextInt();
		System.out.print("2.sayi : ");
		int sayi2 = scan.nextInt();
		toplama(sayi1,sayi2);
		scan.close();
	
	
	}
	
	public static void toplama(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		System.out.println("toplam : " + toplam);
	}

}
