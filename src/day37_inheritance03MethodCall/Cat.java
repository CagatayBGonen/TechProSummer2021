package day37_inheritance03MethodCall;

public class Cat extends Mammal{
	public void method3() {
		System.out.println("Cat");
	}
	public int num3 = 13;
	public int num5 = 90;
	public Cat() {
		System.out.println("p'siz cons cat");
	}
	public Cat(String str) {
		this();
		System.out.println(super.num3);
		System.out.println("p'li cons cat");
	}
}
