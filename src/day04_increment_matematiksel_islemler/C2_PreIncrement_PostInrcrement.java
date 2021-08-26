package day04_increment_matematiksel_islemler;

public class C2_PreIncrement_PostInrcrement {

	public static void main(String[] args) {
		
		int num1=20;
		
		int num2=++num1;
		
		System.out.println("pre-increment num1 : " + num1); //21
		System.out.println("pre-increment num2 : " + num2); //21
		
		num2=num1++;
		
		System.out.println("post-increment num1 : " + num1); //22
		System.out.println("post-increment num2 : " + num2); //21
		
		int num3=10;
		
		System.out.println("pre-increment : " + ++num3); // 11 once artir sonra yazdir
		
		System.out.println("post-increment : " + num3++); // 11 once yazdir sonra artir
		
		System.out.println("post increment'tan sonra num3 : " + num3); // 12
		
		
		
	}

}
