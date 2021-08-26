package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions03 {

	public static void main(String[] args) {
		try { // parent try-catch --> file yerini kontrol ediyor.
			FileInputStream fis = new FileInputStream("C:\\Users\\cbgon\\eclipse-workspace\\java2021Summertr\\src\\day40_exceptions\\file");
		 int i = 0;
		try { // chil try-catch --> file icerigini okulma ve yazdirma islemini kontrol ediyor.
			while((i=fis.read())!=-1) { // i int degeri fis obj read methodu ile atandiginda -1 esit degilse while bodye gir.
				System.out.print((char)(i));
			}
		}catch (IOException e) {// I: input, O: output
			e.printStackTrace();// daha cok kullanilir. Hatanin nerede oldugunu gosterir.
			System.out.println(e.getMessage());
		}
		
		
		
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("\nduzgun calisti!");		
	}

}
