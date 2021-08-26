package day04_increment_matematiksel_islemler;

public class C1_IncrementDecrement {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		num1-=5;  // num1 = 5;
		num2+=10; // num2 = 30;
		
 		System.out.println(num2 / num1);  // 6
 		
 		num1*=2; // 10
 		num2++; // 31
 		
 		System.out.println(num2 / num1);  // 3
 		
 		num1 /=2; // 5
 		
 		double num3 = num2/10; // num2 interger oldugundan num2/10 isleminin sonucunu java 3 olarak bulur
 							   // ama atama islemi yapilirken num3 double oldugu icin
 		                       // bolme isleminin sonucu olan num3'u casting ile 3.0'a cevirir
 		
 		System.out.println(num3); // 3.0 oldu neden?
 		
 		System.out.println(num1*num3); // 15.0 ??
 		
 		num3= (double)num2/10; // num2 degerini increased etmemiz gerkiyor
 		System.out.println(num3); // 3.1 
 		
 		System.out.println(num2); // 31
 		System.out.println((double) num2); // 31.0
 		System.out.println(num2); // 31 
 		
 		
 		
 		num2 +=0.2; // num2 integer
 		
 		System.out.println(num2); // 31
 		
 		
 		
 		
 		
 		
 		
		
		
		
		
		

	}

}
