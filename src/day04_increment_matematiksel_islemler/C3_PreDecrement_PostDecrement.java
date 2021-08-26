package day04_increment_matematiksel_islemler;

public class C3_PreDecrement_PostDecrement {

	public static void main(String[] args) {
		
		int num1=20;
		
		int num2= num1--; // post decrement (once islem yap, sonra artir) 
		
		System.out.println("post decrement num1 : " + num1); // 19
		System.out.println("post decrement num2 : " + num2); // 20
		
		System.out.println(--num2); // 19
		System.out.println(num2--); // 19
		System.out.println(num2); // 18

	}

}
