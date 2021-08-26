package day08_practice01;

public class C2_variables02 {

	public static void main(String[] args) {
		// write a java program to break an integer into sequence of individual digits.
		// hint: use / and %
		// ex: input: 12345
		/*
		 * output: 1 2 3 4 5
		 */
		int x = 12345;
		int birler = x % 10;
		int onlar = x / 10 % 10;
		int yuzler = x / 100 % 10;
		int binler = x / 1000 % 10;
		int onbinler = x / 10000;
		System.out.println("sonuc:" + "\n" + birler + "\n" + onlar + "\n" + yuzler + "\n" + binler + "\n" + onbinler);

	}

}
