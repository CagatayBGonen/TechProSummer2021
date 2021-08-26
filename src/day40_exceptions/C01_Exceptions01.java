package day40_exceptions;

import java.util.Scanner;

public class C01_Exceptions01 {
	//kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.sayi : ");
		int num1=scan.nextInt();
		System.out.println("2.sayi : ");
		int num2= scan.nextInt();
		bolum(num1,num2);
		scan.close();
	}

	public static void bolum(int num1, int num2) {
		try {
		System.out.println(num1/num2);
		} catch (ArithmeticException e) { // try body'sinde muhtemel hata ArithmeticException olarak catch body'a sart olarak yazildi.
			System.out.println("bolme isleminde bolen 0 olamaz."); /*
			             											e: ArithmeticException class'indan data type
			             											   ArithmeticException olan bir exception obj.
			             											   manuel handle yaptik.
			             											*/
			
		}
	
	}
}
