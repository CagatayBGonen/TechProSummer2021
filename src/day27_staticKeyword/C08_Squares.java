package day27_staticKeyword;

public class C08_Squares {
	public static long square(int x) {
		long y = x*(long)x;
		x = -1;
		return y;
	}
	public static void main(String[] args) {
		int value = 9;
		@SuppressWarnings("unused")
		long result = square(value);
		System.out.println(value); // 9

	}

}
