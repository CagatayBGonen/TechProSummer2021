package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// saat ile islem yapmak icin kullaniriz
		// LocalTime classindan obje kullaniriz
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat); // 21:41:42.017374800
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2); // 21:41:42.021366600
		
		System.out.println(saat.plusHours(15));
		
		System.out.println(saat.getSecond()); // 56
		
		System.out.println(saat.now(ZoneId.of("Japan"))); // 03:55:00.973434100
		
		
	}

}
