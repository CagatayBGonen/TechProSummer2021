package replit03;

public class C10_ForWhile10 {

	public static void main(String[] args) {
		/*
		 * 1'den 100'e kadar olan do�al say�lar�n toplam�n� bulan program� yaz�n�z.
		 * 
		 * 
		 * OutPut:
		 * 
		 * Sayilarin Toplami : 5050
		 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("OutPut:" + "\nSayilarin Toplami : " + sum);

	}

}
