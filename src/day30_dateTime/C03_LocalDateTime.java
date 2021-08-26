package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("actual tarih ve zaman : " + ldt);
		
		LocalDate d = LocalDate.of(2016, 1, 10);
		LocalTime t = LocalTime.of(13, 30);
		
		LocalDateTime ldt1 = LocalDateTime.of(d, t);
		System.out.println(d);
		System.out.println(t);
		System.out.println(ldt1);
		
		System.out.println(ldt.getHour());

	}

}
