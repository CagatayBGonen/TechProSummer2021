package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C10_Exceptions10 {
	public static void main(String[] args) throws IOException { // parent olmak zorunda
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\cbgon\\eclipse-workspace\\java2021Summertr\\src\\day40_exceptions\\fil"); // fil --> fil'e'
			int i = 0;

			while ((i = fis.read()) != -1) {

				System.out.print((char) (i));
			}
		} finally {
			System.out.println("devam. Code devam etmiþtir.");
		}
		
		/*
		 * throws keywordu sadece declaration'dir. 
		 * Throws kullanilan methodda exception olusursa, CODE BLOCK olur.
		 * Exceptions arasinda parent-child iliskisi varsa, parent class exception thow'dan sonra yazilmalidir.
		 * 
		 */
	}
	
}