package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate01 {

	public static void main(String[] args) {
		// Java da sadece tarih kullamak istiyorsak 
		// LocalDate class'indan bir obje uretiriz
		
		LocalDate tarih = LocalDate.now();
		System.out.println(tarih); // 2021-08-05
		System.out.println(tarih.plusWeeks(20)); // 2021-12-23
		System.out.println(tarih.plusDays(500)); // 2022-12-18
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); // 2025-01-17
		
		System.out.println(tarih.minusMonths(15)); // 2020-05-05
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); // 2018-03-26
		
		System.out.println(tarih.getDayOfYear()); // 217
		System.out.println(tarih.getMonthValue()); // 8
		System.out.println(tarih.getDayOfWeek()); // Thursday
		LocalDate dogumGunu = LocalDate.of(1997, 12, 2);
		System.out.println(dogumGunu.getDayOfWeek()); // Tuesday
		
		System.out.println(tarih.getMonth()); // August
		
		System.out.println(tarih.isLeapYear()); // false
		
		LocalDate tarih1 = LocalDate.of(1995, 12, 15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2)); // true
		System.out.println(tarih1.isBefore(tarih2)); // false
		
		
	}

}
