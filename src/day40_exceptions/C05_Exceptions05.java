package day40_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C05_Exceptions05 {

	public static void main(String[] args) {
		/*
		 * Eger handle edilecek exceptions larda parent - child ilsikisi varsa 
		 * parent class exception'u olmadan da code calisir ancak:
		 * olumlu durum: tek catch body ile tum exceptionslar handle edilebilir
		 * olumsuz durum: bir hata durumunda hatanin turu vs verileri handle edilme imkani olmaz.
		 */
		
		try { // parent try-catch --> file yerini kontrol ediyor.
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\cbgon\\eclipse-workspace\\java2021Summertr\\src\\day40_exceptions\\file");
			fis.close();
			int i = 0;

			while ((i = fis.read()) != -1) { // i int degeri fis obj read methodu ile atandiginda -1 esit degilse
												// while bodye gir.
				System.out.print((char) (i));
			}
		} catch (IOException e) {// I: input, O: output
			e.printStackTrace();// daha cok kullanilir. Hatanin nerede oldugunu gosterir.
			System.out.println(e.getMessage());
		}

		System.out.println("\nduzgun calisti!");

	}

}
