package day37_inheritance03MethodCall;

public class Animal {
	public int num1 = 10;
	public int num2;
	public Animal() {
		System.out.println("p'siz Animal Cons");
	}
	public Animal(int pli) {
		System.out.println("P'li Animal Cons");
	}
	public void method1() {
		System.out.println("Animal");
	}
	public void method2() {
		System.out.println("Hayvan");
	}
}
