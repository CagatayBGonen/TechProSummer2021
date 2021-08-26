package day37_inheritance03MethodCall;

public class Mammal extends Animal{
	public void method1() { // parenti ile ayni
		System.out.println("mammal");
	}
	public void method3() {
		System.out.println("memeli");
	}
	public int num3 = 10;
	public int num2 = 4; // parenti ile ayni
	public Mammal() {
		this('c');
		System.out.println("psiz mammal cons");
	}
	public Mammal(char c) {
		super(34); // parentli cons call.
		System.out.println("char p'li mammal cons");
		
	}
}
