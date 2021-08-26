package day36_inheritance02;

public class Test01 extends Derived {
	public Test01(String temp) {
		super("Hoscakal");
		System.out.println("Test class " + temp);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Test01 obj = new Test01("Merhaba");
	}

}
