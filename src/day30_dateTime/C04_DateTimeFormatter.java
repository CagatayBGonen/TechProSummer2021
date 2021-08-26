package day30_dateTime;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDate tarih = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 5, 15);
		
		/*
		 * yy: yilin son iki rakami
		 * yyyy: yilin tamamini
		 * y: yilin tamamini
		 * M:ay sirasini yazdirir Temmuz icin : 7
		 * MM: ay sirasini yazdirir Temmuz icin : 07
		 * MMM: ay isminin ilk uc harfini yazdirir  :  JUL
		 * MMMM: ay isminin tamamini verir
		 * dd: gün sirasini yazdirir
		 */
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy"); // 06/8/21
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy"); // 15/05/20
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy"); // 06/Aðu/21
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd$M$yyyy"); // 15$5$2020
		
		System.out.println(dtf.format(tarih));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(tarih));
		System.out.println(dtf3.format(date));
		
		// kac yasindayiz
		
		LocalDate dogumtarihi = LocalDate.of(1997, 12, 2);
		System.out.println("Bugunun tarihi : " + tarih);
		System.out.println("Cagatay dogum tarihi : " + dogumtarihi);
		Period yasim = Period.between(dogumtarihi, tarih);
		System.out.println("benim yasim : " + yasim);
		System.out.println("yasim " + yasim.getYears());
		
		
		
		
	}

}
