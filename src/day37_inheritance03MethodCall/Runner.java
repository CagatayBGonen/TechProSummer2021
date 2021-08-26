package day37_inheritance03MethodCall;

public class Runner {
	
	public static void main(String[] args) {
		Cat c1 =  new Cat(); // psiz cons ile obj. Data Type Cat classindan
		/*
		 * ayni isimli veriable'ler callobj. call edilirken once kendi classindaki veriable call edilir
		 * sonra parentindeki veriable call edilir. 
		 */
		System.out.println(c1.num1);// 10
		System.out.println(c1.num2);// 4 
		System.out.println(c1.num3);// 13
		System.out.println(c1.num5);// 90
		
	}
}
