package day17_nestedForLoopsWhileLoops;

public class C04_WhileLoops02 {

	public static void main(String[] args) {
		// Soru 2 )
		// For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
		// bolunebilen sayilari yazdirin.

		for (int i = 100; i < 1000; i++) {
			if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("");
		int num = 100;
		while (num < 1000) {
			if (num % 15 == 0 && num % 20 == 0 && num % 90 == 0) {
				System.out.print(num + ",");
			}
			num++;
		}
	}

}
