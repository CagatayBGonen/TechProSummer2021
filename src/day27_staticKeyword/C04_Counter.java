package day27_staticKeyword;

public class C04_Counter {
	int count;
	static int stCount;
	public C04_Counter() {
		count++;
		stCount++;
	}
	public int getCount() {
		return count;
	}
	public static int getStCount() {
		return stCount;
	}
	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		C04_Counter cs1 = new C04_Counter();
		C04_Counter cs2 = new C04_Counter();
		C04_Counter cs3 = new C04_Counter();
		C04_Counter cs4 = new C04_Counter();
		C04_Counter cs5 = new C04_Counter();
		C04_Counter cs6 = new C04_Counter();
		System.out.println("count is: " + cs6.getCount()); // 1
		System.out.println("stcount is: " + cs6.getStCount()); // 6
		
		System.out.println("count is: " + cs1.getCount()); // 1
		System.out.println("stcount is: " + cs1.getStCount()); // 6
	}

}
