package day40_exceptions;

public class C11_Exceptions11 {

	public static void main(String[] args) {
		
		int[] arr = {34,35,41,63,21};
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("hatali index girdiniz");			
		}
		finally { 
			System.out.println("devam. Code devam etmi�tir.");
		}
		/*
		 * Finally block try-catch blogu ile kullanilir.
		 * 
		 * Finally block, her durumda calisir.
		 * 
		 * Finally block cloud veya database ile connection'i bitirme veya uzerine
		 * calisilan dosyayi kapatma gibi islemler icin kullanilir.
		 *
		 * !!! Finally block catch blogu olmadan sadece try ile de kullanilabilir.
		 * 	Bu durumda catch blogu olmadiginda Java throws exception ardindan finally ile istedigimiz islemi yapar.
		 * 
		 * 
		 */
	}

}
