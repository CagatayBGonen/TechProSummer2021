package day30_dateTime;

import java.time.LocalDate;

public class C05_ComparingDateTime {

	public static void main(String[] args) {
		
		LocalDate bugun = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 11, 15);
		int fark = bugun.compareTo(date);
		System.out.println(bugun);
		System.out.println(date);
		System.out.println(fark); // 1: karsilastirilan iki tarihin en  buyuk parcasinin farkini verir.
		

	}

}
