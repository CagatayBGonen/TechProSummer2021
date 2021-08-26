package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_Exceptions04 {
	
	public static void main(String[] args) {
		try { // parent try-catch --> file yerini kontrol ediyor.
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\cbgon\\eclipse-workspace\\java2021Summertr\\src\\day40_exceptions\\file");
			fis.close();
			int i = 0;

			while ((i = fis.read()) != -1) { // i int degeri fis obj read methodu ile atandiginda -1 esit degilse
												// while bodye gir.
				System.out.print((char) (i));
			}
		} catch (FileNotFoundException e) { // catchler arasinda hiyerarþi vardir. yukaridan-asagiya parent-child iliskisi.
			System.out.println(e.getMessage());
			// e.printStackTrace();

		} catch (IOException e) {// I: input, O: output
			e.printStackTrace();// daha cok kullanilir. Hatanin nerede oldugunu gosterir.
			System.out.println(e.getMessage());
		}

		System.out.println("\nduzgun calisti!");
	}

}
