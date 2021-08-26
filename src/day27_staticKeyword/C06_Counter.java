package day27_staticKeyword;

public class C06_Counter {
	int count = 0;
	
	C06_Counter(){
		count++;
		System.out.println(count);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		C06_Counter c1 = new C06_Counter(); // count=1 | 1
		C06_Counter c2 = new C06_Counter(); // count=1 | 1
		C06_Counter c3 = new C06_Counter(); // count=1 | 1

	}

}
